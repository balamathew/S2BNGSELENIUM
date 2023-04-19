package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
////import io.cucumber.junit.Cucumber;
////import io.cucumber.junit.CucumberOptions;
////import org.junit.runner.RunWith;
//
@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"src/test/java/Features/Morescenarios.feature"},
                glue = {"glue"},
                monochrome = true,
                dryRun =false
             // plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        )

public class Testrunner {

}
