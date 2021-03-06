package ua.begem.bl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();
    }

    @Test
    public void add() {
        int expectedResult1 = 10;
        int actualResult1 = calculator.add(3, 7);
        assertEquals(expectedResult1, actualResult1);

        int expectedResult2 = -5;
        int actualResult2 = calculator.add(-10, 5);
        assertEquals(expectedResult2, actualResult2);

        int expectedResult3 = -15;
        int actualResult3 = calculator.add(-10, -5);
        assertEquals(expectedResult3, actualResult3);
    }

    @Test
    public void sub() {
        int expectedResult1 = 7;
        int actualResult1 = calculator.sub(10, 3);
        assertEquals(expectedResult1, actualResult1);

        int expectedResult2 = -3;
        int actualResult2 = calculator.sub(4, 7);
        assertEquals(expectedResult2, actualResult2);

        int expectedResult3 = 0;
        int actualResult3 = calculator.sub(-10, -10);
        assertEquals(expectedResult3, actualResult3);

    }

    @Test
    public void mul() {
        int expectedResult1 = 20;
        int actualResult1 = calculator.mul(4, 5);
        assertEquals(expectedResult1, actualResult1);

        int expectedResult2 = -20;
        int actualResult2 = calculator.mul(-4, 5);
        assertEquals(expectedResult2, actualResult2);

        int expectedResult3 = 20;
        int actualResult3 = calculator.mul(-4, -5);
        assertEquals(expectedResult3, actualResult3);
    }

    @Test
    public void div() {
        int expectedResult1 = 20;
        int actualResult1 = calculator.div(100, 5);
        assertEquals(expectedResult1, actualResult1);

        int expectedResult2 = -20;
        int actualResult2 = calculator.div(100, -5);
        assertEquals(expectedResult2, actualResult2);

        int expectedResult3 = 20;
        int actualResult3 = calculator.div(-100, -5);
        assertEquals(expectedResult3, actualResult3);

        int expectedResult4 = 0;
        int actualResult4 = calculator.div(100, 0);
        assertEquals(expectedResult4, actualResult4);

        int expectedResult5 = 0;
        int actualResult5 = calculator.div(0, 0);
        assertEquals(expectedResult5, actualResult5);

        int expectedResult6 = 0;
        int actualResult6 = calculator.div(0, 5);
        assertEquals(expectedResult6, actualResult6);

    }
}