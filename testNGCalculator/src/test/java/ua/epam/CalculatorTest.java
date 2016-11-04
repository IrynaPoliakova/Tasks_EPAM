package ua.epam;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.lang.reflect.Method;

import static org.testng.Assert.*;
import static ua.epam.Calculator.*;

/**
 * Created by Iryna_Poliakova on 10/28/2016.
 */
public class CalculatorTest extends TestBase {

    @Test(dataProvider = "getDataProviderLong", groups = {"positive", "smoke"} )
    public void testSumLong( long a, long b, long expected) throws Exception {
        assertEquals(calculator.sum(a,b), expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testSumDouble(double a, double b, double expected, double delta) throws Exception  {
        assertEquals(calculator.sum(a,b), expected, delta);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"positive", "smoke"})
    public void testSubLong(long a, long b, long expected) throws Exception {
        assertEquals(calculator.sub(a,b), expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testSubDouble(double a, double b, double expected, double delta) throws Exception {
        assertEquals(calculator.sub(a,b), expected, delta);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"positive", "smoke"} )
    public void testMultLong(long a, long b, long expected) throws Exception {
        assertEquals(calculator.mult(a,b),expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testMultDouble(double a, double b, double expected) throws Exception {
        assertEquals(calculator.mult(a,b),expected);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"positive","smoke"})
    public void testDivLong(long a, long b, long expected) throws Exception {
        assertEquals(calculator.div(a,b),expected);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"negative"},
            expectedExceptions = NumberFormatException.class)
    public void testDivOnZeroLong(long a, long b, long expected) throws Exception {
        assertEquals(calculator.div(a,b),expected);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testDivDouble(double a, double b, double expected, double delta) throws Exception {
        assertEquals(calculator.div(a,b),expected, delta);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"negative"},
            expectedExceptions = NumberFormatException.class)
    public void testDivOnZeroDouble(double a, double b, double expected) throws Exception {
        assertEquals(calculator.div(a,b),expected);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testPow(double a, double b, double expected) throws Exception {
        assertEquals(calculator.pow(a, b),expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testSqrt(double a, double expected, double delta) throws Exception {
        assertEquals(calculator.sqrt(a), expected, delta);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"negaive"},
            expectedExceptions = NumberFormatException.class)
    public void testSqrtNegativeNum(double a, double expected) throws Exception {
        assertEquals(calculator.sqrt(a), expected);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testTg(double a, double expected) throws Exception {
        assertEquals(calculator.tg(a),expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testCtg(double a, double expected) throws Exception {
        assertEquals(calculator.ctg(a), expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"negative"},
            expectedExceptions = NumberFormatException.class)
    public void testCtgWithZero(double a, double expected) throws Exception {
        assertEquals(calculator.ctg(a), expected);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testCos(double a, double expected) throws Exception {
        assertEquals(calculator.cos(a),expected);
    }

    @Test(dataProvider = "getDataProviderDouble", groups = {"positive"})
    public void testSin(double a, double expected, double delta) throws Exception {
        assertEquals(calculator.sin(a),expected, delta);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"positive"})
    public void testIsPositive(long a) throws Exception {
        assertTrue(calculator.isPositive(a));
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"negaive"})
    public void testIsPositiveWithWrondData(long a) throws Exception {
        assertFalse(calculator.isPositive(a));
        Thread.sleep(2000);
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"positive"})
    public void testIsNegative(long a) throws Exception {
        assertTrue(calculator.isNegative(a));
    }

    @Test(dataProvider = "getDataProviderLong", groups = {"negative"})
    public void testIsNegativeWithWrondData(long a) throws Exception {
        assertFalse(calculator.isNegative(a));
        Thread.sleep(2000);
    }

}