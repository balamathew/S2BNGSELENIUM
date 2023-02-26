package glue;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ActionMethods {
    WebDriver driver;

    public  void getscreenshot(){

        TakesScreenshot ts=(TakesScreenshot)driver;
      File src=ts.getScreenshotAs(OutputType.FILE);
      File trg=new File(".//glue.Screenshots.png");

    }
}
