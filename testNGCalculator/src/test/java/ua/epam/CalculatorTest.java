package ua.epam;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ua.epam.Calculator.*;

/**
 * Created by Iryna_Poliakova on 10/28/2016.
 */
public class CalculatorTest extends TestBase {

    @Test(dataProvider = "getDataProviderLong", groups = {"addition", "long"} )
    public void testSumLong( long a, long b, long expected) throws Exception {
        assertEquals(calculator.sum(a,b), expected);
    }


    @Test(dataProvider = "getDataProviderDouble", groups = {"addition", "double"})
    public void testSumDouble(double a, double b, double expected) throws Exception {
        assertEquals(calculator.sum(a,b), expected);
    }


    @Test(dataProvider = "getDataProviderLong", groups = {"subtraction", "long"})
    public void testSubLong(long a, long b, long expected) throws Exception {
        assertEquals(calculator.sub(a,b), expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"subtraction", "double"})
    public void testSubDouble(double a, double b, double expected) throws Exception {
        assertEquals(calculator.sub(a,b), expected);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"multiplication", "long"} )
    public void testMultLong(long a, long b, long expected) throws Exception {
        assertEquals(calculator.mult(a,b),expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"multiplication", "double"})
    public void testMultDouble(double a, double b, double expected) throws Exception {
        assertEquals(calculator.mult(a,b),expected);
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