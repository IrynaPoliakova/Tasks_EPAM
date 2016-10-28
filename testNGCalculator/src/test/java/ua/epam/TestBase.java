package ua.epam;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Iryna_Poliakova on 10/28/2016.
 */
public class TestBase {
    public Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void beforeSuite() {
        calculator = new Calculator();
    }


    protected void print(String msg) throws NumberFormatException{
        System.out.println(msg);
    }

}
