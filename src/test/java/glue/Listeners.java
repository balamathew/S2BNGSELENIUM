package glue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, JavascriptExecutor {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("on teststarts open the application");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("on test sucess takes the screen shot");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("on test failure takes the screenshot and capture the exception");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("on start opens the chrome");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("on finish logout from the application");
    }

    @Override
    public Object executeScript(String script, Object... args) {
        return null;
    }

    @Override
    public Object executeAsyncScript(String script, Object... args) {
        return null;
    }
}
