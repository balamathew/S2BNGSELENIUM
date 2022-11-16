package Seleniumm;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Javascriptexecutor {

    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    //click
    js.executeScript("arguments[0].click","element");

    //taking screenshot

        TakesScreenshot ts=(TakesScreenshot)driver;

        File src=ts.getScreenshotAs(OutputType.FILE);

        File trg= new File(("locationfiletype.png"));

        FileUtils.copyFile(src,trg);

    //scrolldown

        js.executeScript("window.scrollBy(0,500)","");

    //highlight

        js.executeScript("arguments[0].style.border='2px solid red')"," ");

    //sendkeys

        js.executeScript("arguments[0].values='';","webelement");
  //scrolltoelement

        js.executeScript("arguments[0].scrollintoview(true)",src);

    }
}
