package week6.inheritance.wednesday.triangle;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    public void Triangle() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;

        String expected = "Tam giác đều";
        String actual = TriangleClassifier.classify(side1, side2, side3);
        assertEquals(expected, actual);
    }

    @Test
    public void Triangle1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;

        String expected = "Tam giác cân";
        String actual = TriangleClassifier.classify(side1, side2, side3);
        assertEquals(expected, actual);
    }

    @Test
    public void Triangle2() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String expected = "Tam giác thường";
        String actual = TriangleClassifier.classify(side1, side2, side3);
        assertEquals(expected, actual);
    }

    @Test
    public void Triangle3() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;

        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.classify(side1, side2, side3);
        assertEquals(expected, actual);
    }

    @Test
    public void Triangle4() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;

        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.classify(side1, side2, side3);
        assertEquals(expected, actual);
    }

    @Test
    public void Triangle5() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;

        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.classify(side1, side2, side3);
        assertEquals(expected, actual);
    }
}