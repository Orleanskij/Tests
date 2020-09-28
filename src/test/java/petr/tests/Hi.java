package petr.tests;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;



public class Hi extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        log("Привет");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log("Привет");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        log("Привет");
    }

    private void log(String string) {
        System.out.println(string);

    }
}
