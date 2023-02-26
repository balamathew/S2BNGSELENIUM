package TestRunner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {".//Features/Morescenarios.feature"},
                glue = {"glue"},
                monochrome = true,
                dryRun =false,
                plugin = {"pretty","html:target/cucumber-newreports.html"}
        )

public class Testrunner{
}
