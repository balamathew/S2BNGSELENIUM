package Seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

    public static void main(String[] args) throws InterruptedException {
//frames - part of the webpage
        //iframes- part of diffrent source , cant didrectly interactable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.switchTo().frame(1);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("");
        driver.switchTo().defaultContent();
    }
}
