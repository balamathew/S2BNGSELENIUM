package glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Background {

    public void backgroundd(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");
        WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
        driver.manage().window().maximize();

    }
}
