public class Car {

    private int kennung;
    private Ticket ticket;

    public Car(int kennung, Ticket ticket) {
        this.kennung = kennung;
        this.ticket = ticket;
    }

    public int getKennung() {
        return kennung;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
