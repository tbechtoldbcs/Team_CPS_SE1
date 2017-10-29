import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PreisCalculatorIFTest {
    private PreisCalculatorIF simple, complex, custom;

    @Before
    public void setUp(){
        //TODO create PreisCalculator objects
    	//simple.stundensatz = 1d;
    	//complex.stundensatz = 2.33d;
    	//custom.stundensatz = 2d;
    }

    @Test
    public void berechnePreis_simple_ReturnsExpectedValue(){
    	assertEquals(5d, simple.berechnePreis(5));
    }
    
    @Test
    public void berechnePreis_zeroHours_ReturnsExpectedValue(){
    	assertEquals(0, simple.berechnePreis(0));
    }
    
    @Test
    public void berechnePreis_complex_ReturnsExpectedValue(){
    	assertEquals(18.64d, complex.berechnePreis(8));
    }
    
    @Test
    public void setStundensatz_customStundensatz_ReturnsExpectedValue(){
    	custom.setStundensatz(1d);
    	assertEquals(5d, simple.berechnePreis(5));
    }
}
