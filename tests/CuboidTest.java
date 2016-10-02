import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by William on 02/10/2016.
 */
public class CuboidTest {

    Cuboid c;

    @BeforeMethod
    public void setUp() throws Exception {
        c = new Cuboid(3.0,4.0,5.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testSurface() throws Exception {
        double surface = 2.0 * (3.0*4.0 + 4.0*5.0 + 3.0*5.0);
        assertEquals(c.surface(),surface);
    }

    @Test
    public void testVolume() throws Exception {
        double volume = 3.0 * 4.0 * 5.0;
        assertEquals(c.volume(),volume);
    }

}