package Seleniumm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Chromeoptions {

    public static void main(String[] agg) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\Driversc\\chromedriver.exe");
        ChromeOptions ooptions=new ChromeOptions();

        //disable notification
       ooptions.addArguments("--disable-notifications");

       //incognito mode
       ooptions.addArguments("--incognito");

       // set download directory
       Map<String,Object> prefs=new HashMap<String,Object>();
       prefs.put("Downloadedfile",System.getProperty("user.dir")+ File.separator+"Excelpath");
        ooptions.setExperimentalOption("prefs",prefs);

        //set dimension
        Dimension dim=new Dimension(300,300);
//        DesiredCapabilities dc=new DesiredCapabilities();
//        dc.setAcceptInsecureCerts(true);
//        dc.setBrowserName("my browser");
      // dc.merge(ooptions);

        WebDriver driver=new ChromeDriver(ooptions);
        driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
        driver.manage().window().maximize();

        // to get thge location of the element
        WebElement we=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
       Point s= we.getLocation();
        System.out.println("x is"+s.x);
    int g= s.y;
        System.out.println("y is"+g);

        we.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));

       // driver.manage().window().setSize(dim);
        //to zoom in
        Thread.sleep(3000);
        we.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        //to zoom out

       // we.sendKeys(Keys.chord(Keys.CONTROL,"-"));




























    }
}
