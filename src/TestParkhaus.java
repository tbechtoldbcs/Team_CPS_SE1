import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestParkhaus {

    ControlerParkhaus c_parkhaus;
    Parkhaus parkhaus;
    int ticketNr;

    @Before
    public void before() {
        c_parkhaus = new ControlerParkhaus(0.90);
        parkhaus = c_parkhaus.getParkhaus();

    }

    @Test
    public void einfahren() {
        ticketNr = parkhaus.einfahren();
        Assert.assertEquals(0, parkhaus.getTicket(ticketNr).getStunde());
    }

    @Test
    public void parkpreis() {
        Assert.assertEquals(0.90, parkhaus.getParkpreis(), 0.0);
        c_parkhaus.setParkpreis(1.10);
        Assert.assertEquals(1.10, parkhaus.getParkpreis(), 0.0);
    }

    @Test
    public void stundeVergehen() {
        ticketNr = parkhaus.einfahren();
        Assert.assertEquals(0, parkhaus.getTicket(ticketNr).getStunde());
        Assert.assertEquals(0.9, parkhaus.getTicket(ticketNr).getPreis(), 0.0);
        //parkhaus.getTicket(ticketNr).stundePlus();
        parkhaus.stundePlus();
        Assert.assertEquals(1, parkhaus.getTicket(ticketNr).getStunde());
        Assert.assertEquals(1.8, parkhaus.getTicket(ticketNr).getPreis(), 0.0);
    }

    @Test
    public void ausfahren() {
        ticketNr = parkhaus.einfahren();
        Assert.assertEquals(0.9, parkhaus.ausfahren(ticketNr), 0.0);
        Assert.assertEquals(null, parkhaus.getTicket(ticketNr));
    }

    @Test
    public void view() {
        int ticketNr1 = parkhaus.einfahren();
        int ticketNr2 = parkhaus.einfahren();
        parkhaus.ausfahren(ticketNr1);
        parkhaus.stundePlus();
        Assert.assertEquals(0.9, c_parkhaus.getDaily().display(), 0.0);
        parkhaus.stundePlus();
        int ticketNr3 = parkhaus.einfahren();
        parkhaus.stundePlus();
        parkhaus.ausfahren(ticketNr2);
        parkhaus.ausfahren(ticketNr3);
        parkhaus.stundePlus();
        Assert.assertEquals(9.0, c_parkhaus.getDaily().display(), 0.0);
    }
}
