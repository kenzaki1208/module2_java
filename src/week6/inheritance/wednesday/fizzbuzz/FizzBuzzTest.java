package week6.inheritance.wednesday.fizzbuzz;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void Fizz() {
        assertEquals("Fizz",FizzBuzz.isFizzBuzz(9));
    }

    @Test
    public void Buzz() {
        assertEquals("Buzz",FizzBuzz.isFizzBuzz(10));
    }

    @Test
    public void FizzBuzz() {
        assertEquals("FizzBuzz",FizzBuzz.isFizzBuzz(15));
    }

    @Test
    public void FizzBuzzTester() {
        assertEquals("28",FizzBuzz.isFizzBuzz(28));
    }

    @Test
    public void FizzBuzzTester1() {
        assertEquals("Fizz",FizzBuzz.isFizzBuzz(13));
    }

    @Test
    public void FizzBuzzTester2() {
        assertEquals("Buzz",FizzBuzz.isFizzBuzz(52));
    }

    @Test
    public void FizzBuzzTrans() {
        assertEquals("Hai mươi",FizzBuzzTranslate.Translate(2, 0));
    }

    @Test
    public void FizzBuzzTrans1() {
        assertEquals("Hai mươi Sáu",FizzBuzzTranslate.Translate(2, 6));
    }
}