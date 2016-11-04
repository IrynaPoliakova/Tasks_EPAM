package ua.epam;

import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import java.lang.reflect.Method;

/**
 * Created by Iryna_Poliakova on 10/28/2016.
 */
public class TestBase{
    public Calculator calculator;

    //static final Logger LOGGER = Logger.getLogger(CalculatorTest.class);

//    @BeforeMethod(alwaysRun = true)
//    public void logging(){
//        CalculatorTest calculatorTest = new CalculatorTest();
//        Class clazz = calculatorTest.getClass();
////        Method method = clazz.getMethod();
////        LOGGER.info("Test class = " + clazz + "Method name = " + method);
//    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        System.out.println("Tests have run");
    }


    protected void print(String msg) throws NumberFormatException{
        System.out.println(msg);
    }

    @DataProvider(name = "getDataProviderLong")
    public static Object[][] getDataLong(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();
        return readerXLS.parseLong(nameSheet);
    }

    @DataProvider(name = "getDataProviderDouble")
    public static Object[][] getDataDouble(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();
        return readerXLS.parseDouble(nameSheet);
    }

}
