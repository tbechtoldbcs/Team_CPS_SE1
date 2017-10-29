import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//Über Datentyp für Zeit noch nicht entschieden, vorerst int (0 = 0:00, 1 = 0:01 ... 1339 = 23:59)
public class OeffnungszeitenIFTest {
	
    private OeffnungszeitenIF simple;

    @Before
    public void setUp(){
        //TODO create Oeffnungszeiten objects
    	//simple.oeffnungszeit = 600;
    	//simple.schliessungszeit = 1200
    }
    
    @Test
    public void getOeffnungszeit_simple_ReturnsExpectedValue(){
    	assertEquals(600, simple.getOeffnungszeit());
    }
    
    @Test
    public void getSchliessungszeit_simple_ReturnsExpectedValue(){
    	assertEquals(1200, simple.getSchliessungszeit());
    }
    
    @Test
    public void setOeffnungszeiten_simple_ReturnsTrue(){
    	simple.setOeffnungszeiten(700, 1100);
    	assertEquals(700, simple.getOeffnungszeit());
    	assertEquals(1100, simple.getSchliessungszeit());
    }
    
    @Test(expected=Exception.class)
    public void setOeffnungszeiten_SchliesszeitZuHoch_ReturnsCustomException(){
    	simple.setOeffnungszeiten(0, 1440);
    }
    
    @Test(expected=Exception.class)
    public void setOeffnungszeiten_OeffnungszeitHoeherAlsSchliesszeit_ReturnsCustomException(){
    	simple.setOeffnungszeiten(1000, 400);
    }
}
