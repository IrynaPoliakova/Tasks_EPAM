package ua.epam;

import org.testng.annotations.*;

import java.lang.reflect.Method;

/**
 * Created by Iryna_Poliakova on 10/28/2016.
 */
public class TestBase {
    public Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void beforeSuite() {
        System.out.println();
        calculator = new Calculator();
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
