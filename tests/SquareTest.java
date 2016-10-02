import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by William on 02/10/2016.
 */
public class SquareTest {

    Square s;

    @BeforeMethod
    public void setUp() throws Exception {
        s = new Square(5.0,5.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void sameLength() throws Exception{
        Square other = new Square(5.0,2.0);
        assertEquals(other.getWidth(),5.0);
    }

}