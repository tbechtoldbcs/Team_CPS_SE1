import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreiePlaetzeIFTest {
    private FreiePlaetzeIF leer, voll;

    @Before
    public void setUp(){
        //TODO create FreiePlaetze objects
    }

    @Test
    public void plaetzeFrei_leer_ReturnsTrue(){
    	assertTrue(leer.plaetzeFrei());
    }
    
    @Test
    public void plaetzeFrei_voll_ReturnsFalse(){
    	assertFalse(voll.plaetzeFrei());
    }
}
