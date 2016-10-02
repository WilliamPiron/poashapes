import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by William on 02/10/2016.
 */
public class RectangleTest {

    Rectangle r;

    @BeforeMethod
    public void setUp() throws Exception {
        r = new Rectangle(5.0,4.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testSurface() throws Exception {
        assertEquals(r.surface(),20.0);
    }

    @Test
    public void testPerimeter() throws Exception {
        assertEquals(r.perimeter(),18.0);
    }

}