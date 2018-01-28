public class ViewWeekly {

    private double value;
    private Parkhaus model;

    public void update() {
        value = model.getWeekly();
    }

    public double display() {
        return value;
    }

    public void setModel(Parkhaus model) {
        this.model = model;
    }

}
