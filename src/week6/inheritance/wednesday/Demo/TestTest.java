package week6.inheritance.wednesday.Demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestTest {

    @Test
    public void testTest1() {
        int actual = TestMain.add(1, 1);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testTest2() {
        int actual = TestMain.add(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }

//    @Test
//    public void testMaxAdd() {
//        assertThrows(IllegalArgumentException.class, () => TestMain.add(3,6));
//    }
}
