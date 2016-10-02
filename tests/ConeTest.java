import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by William on 02/10/2016.
 */
public class ConeTest {

    Cone c;

    @BeforeMethod
    public void setUp() throws Exception {
        c = new Cone(10.0,5.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testSurface() throws Exception {
        double base = Math.PI * 25.0;
        double laterale = Math.PI * 5.0 * Math.sqrt(125.0);
        double total = base + laterale;
        assertEquals(c.surface(),total);
    }

    @Test
    public void testVolume() throws Exception {
        double volume = (1.0/3.0) * Math.PI * 250.0;
        assertEquals(c.volume(),volume);
    }

}