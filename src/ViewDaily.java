public class ViewDaily {

    private double value;
    private Parkhaus model;

    public void update() {
        value = model.getDaily();
    }

    public double display() {
        return value;
    }

    public void setModel(Parkhaus model) {
        this.model = model;
    }
}
