package ua.epam;

import org.testng.*;
import org.testng.log4testng.Logger;

/**
 * Created by Iryna_Poliakova on 11/4/2016.
 */
public class Listener implements ITestListener {

    // This belongs to ITestListener and will execute only when the test is pass

    public void onTestSuccess(ITestResult result) {

        Reporter.log("Result success: " + result.getTestName() + result.getClass().getSimpleName()
                + result.getMethod().getMethodName() + " - " + result.getStatus()
                + " Test duration: " + (result.getEndMillis()-result.getStartMillis()));

    }

    // This belongs to ITestListener and will execute only on the event of fail test

    public void onTestFailure(ITestResult result) {

        Reporter.log("Test failed: " + result.getTestName() + result.getClass().getSimpleName()
                + result.getMethod().getMethodName() + " - " + result.getStatus()
                + " Test duration: " + (result.getEndMillis()-result.getStartMillis()));

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    public void onTestStart(ITestResult iTestResult) {

    }
}
