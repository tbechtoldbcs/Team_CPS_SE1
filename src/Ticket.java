public class Ticket {

    private boolean bezahlt;
    private int stunde;

    ControlerParkhaus controler;

    public Ticket(ControlerParkhaus controler) {
        this.controler = controler;
        bezahlt = false;
        stunde = 0;
    }

    public int getStunde() {
        return stunde;
    }

    public void stundePlus() {
        if(!bezahlt) this.stunde++;
    }

    public double getPreis() {
        return controler.getParkpreis() * (stunde + 1);
    }

    public double bezahlen() {
        bezahlt = true;
        return getPreis();
    }
}
