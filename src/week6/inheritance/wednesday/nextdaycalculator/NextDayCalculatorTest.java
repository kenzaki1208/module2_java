package week6.inheritance.wednesday.nextdaycalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {

    @Test
    public void testFindNextDay() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = "1/2/2018";
        String actual = NextDayCalculator.findNextDay(day, month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "2/1/2018";
        String actual = NextDayCalculator.findNextDay(day, month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindNextDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = "1/5/2018";
        String actual = NextDayCalculator.findNextDay(day, month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindNextDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;

        String expected = "1/3/2018";
        String actual = NextDayCalculator.findNextDay(day, month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindNextDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expected = "1/3/2020";
        String actual = NextDayCalculator.findNextDay(day, month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindNextDay5() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expected = "1/1/2019";
        String actual = NextDayCalculator.findNextDay(day, month, year);

        assertEquals(expected, actual);
    }
}
