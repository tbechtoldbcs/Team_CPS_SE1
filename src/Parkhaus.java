import java.util.Arrays;
import java.util.HashMap;

public class Parkhaus {

    private int belegte_p = 0;
    private ControlerParkhaus controler;
    private double[] hourlyEarnings = new double[24];
    private int currentHour;
    private double[] dailyEarnings = new double[7];
    private int currentDay;
    private HashMap<Integer, Ticket> tickets = new HashMap();

    public Parkhaus(ControlerParkhaus controler) {
        this.controler = controler;
    }

    public int einfahren() {
        tickets.put(belegte_p++, new Ticket(controler));
        return belegte_p - 1;
    }

    public double getParkpreis() {
        return controler.getParkpreis();
    }

    public double ausfahren(int ticket) {
        double temp = tickets.get(ticket).bezahlen();
        hourlyEarnings[currentHour] += temp;
        tickets.remove(ticket);
        return temp;
    }

    public Ticket getTicket(int nr) {
        return tickets.get(nr);
    }

    public void stundePlus() {
        currentHour++;

        tickets.forEach((k, v) -> v.stundePlus());
        Arrays.stream(hourlyEarnings).forEach(v -> dailyEarnings[currentDay] += v);
        if(currentHour > 23) {
            currentDay++;
        }

        if(currentDay > 6) {
            dailyEarnings = new double [7];
        }

        currentHour %= 23;
        currentDay %= 29;
        controler.update();
    }

    public double getDaily() {
        return dailyEarnings[currentDay];
    }

    public double getWeekly() {
        double value = 0.0;
        for(int i = 1; i < currentDay+1; i++) {
            value += dailyEarnings[i];
        }
        return value;
    }
}
