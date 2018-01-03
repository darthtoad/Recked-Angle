import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/3/18.
 */
public class ReckedAngleTest {

    @Test
    public void newReckedAngle_instantiatesCorrectly() throws Exception {
        ReckedAngle testReckedAngle = new ReckedAngle(2, 4);
        assertEquals(true, testReckedAngle instanceof ReckedAngle);
    }

    @Test
    public void newReckedAngle_getsHaight_2() {
        ReckedAngle testReckedAngle = new ReckedAngle(2, 4);
        assertEquals(2, testReckedAngle.getHaight());
    }

    @Test
    public void newReckedAngle_getsWithe_4() {
        ReckedAngle testReckedAngle = new ReckedAngle(2, 4);
        assertEquals(4, testReckedAngle.getWithe());
    }

    @Test
    public void isSquare_whenNotASquare_false() {
        ReckedAngle testReckedAngle = new ReckedAngle(2, 4);
        assertEquals(false, testReckedAngle.isSquare());
    }

    @Test
    public void isSquare_sidesEqual_true() {
        ReckedAngle testReckedAngle = new ReckedAngle(2, 2);
        assertEquals(true, testReckedAngle.isSquare());
    }
}