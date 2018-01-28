public class ControlerParkhaus {

    private double parkpreis;
    private Parkhaus parkhaus;
    private ViewDaily daily;
    private ViewWeekly weekly;

    public ControlerParkhaus(double preis) {
        parkhaus = new Parkhaus(this);
        this.parkpreis = preis;

        this.daily = new ViewDaily();
        daily.setModel(parkhaus);
        this.weekly = new ViewWeekly();
        weekly.setModel(parkhaus);
    }

    public double getParkpreis() {
        return parkpreis;
    }

    void setParkpreis(double preis) {
        this.parkpreis = preis;
    }

    public Parkhaus getParkhaus() {
        return parkhaus;
    }

    public ViewDaily getDaily() {
        return daily;
    }

    public ViewWeekly getWeekly() {
        return weekly;
    }

    public void update() {
        if(weekly != null) {
            weekly.update();
        }

        if(daily != null) {
            daily.update();
        }
    }
}
