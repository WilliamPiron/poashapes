import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by William on 02/10/2016.
 */
public class SphereTest {

    Sphere s;

    @BeforeMethod
    public void setUp() throws Exception {
        s = new Sphere(10.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testSurface() throws Exception {
        double surface = 400.0 * Math.PI;
        assertEquals(s.surface(),surface);
    }

    @Test
    public void testVolume() throws Exception {
        double volume = (4.0/3.0) * Math.PI * 1000.0;
        assertEquals(s.volume(),volume);
    }

}