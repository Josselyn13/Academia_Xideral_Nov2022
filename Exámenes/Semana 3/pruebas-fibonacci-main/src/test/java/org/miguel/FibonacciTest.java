package org.miguel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This class uses jUnit 5.8.2 for testing {@link Fibonacci#compute(int)}
 *
 * Test cases:
 *  Should compute zero if number is zero
 *  Should compute one if number is one
 *  Should compute one if number is two
 *  Should compute two if number is three
 *  Should compute three if number is four
 *  Should compute thirteen if number is seven
 *  Should compute 144 if number is twelve
 *  Should raise an exception if number is negative
 */

public class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldComputeReturnZeroIfNumberIsZero(){
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfNumberIsTwo(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfNumberIsThree(){
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnThreeIfNumberIsFour(){
        int expectedValue = 3;
        int obtainedValue = fibonacci.compute(4);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnThirteenIfNumberIsSeven(){
        int expectedValue = 13;
        int obtainedValue = fibonacci.compute(7);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturn144IfNumberIsTwelve(){
        int expectedValue = 144;
        int obtainedValue = fibonacci.compute(12);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldRaiseAnExceptionIfNumberIsNegative(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}
