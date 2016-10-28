package ua.epam;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ua.epam.Calculator.*;

/**
 * Created by Iryna_Poliakova on 10/28/2016.
 */
public class CalculatorTest extends TestBase {

    @Test(groups = {"addition", "functional", "regression", "positive"})
    public void testSumLong() throws Exception {
        assertEquals(5,calculator.sum(2,3));
    }


    @Test(groups = {"addition", "functional", "regression", "positive"})
    public void testSumDouble() throws Exception {
        assertEquals(11.0,calculator.sum(5.5,5.5));
    }


    @Test
    public void testSubLong() throws Exception {

    }

    @Test
    public void testSubDouble() throws Exception {

    }

    @Test
    public void testMultLong() throws Exception {

    }

    @Test
    public void testMultDouble() throws Exception {

    }

    @Test
    public void testDivLong() throws Exception {

    }

    @Test
    public void testDivDouble() throws Exception {

    }

    @Test
    public void testPow() throws Exception {

    }

    @Test
    public void testSqrt() throws Exception {

    }

    @Test
    public void testTg() throws Exception {

    }

    @Test
    public void testCtg() throws Exception {

    }

    @Test
    public void testCos() throws Exception {

    }

    @Test
    public void testSin() throws Exception {

    }

    @Test
    public void testIsPositive() throws Exception {

    }

    @Test
    public void testIsNegative() throws Exception {

    }

}