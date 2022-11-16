package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
         features = {".//Features/Gmaillogin.feature"},
                glue = {"pages"},
                monochrome = true,
                dryRun = false,
                plugin = {"pretty","html:test.ouput"}







        )

public class Testrunner {
}
