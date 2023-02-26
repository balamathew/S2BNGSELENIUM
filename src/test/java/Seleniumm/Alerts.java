package Seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class
Alerts {

    public static void main(String[] args) {
        //Alerts are from browser not from application
        //Notification popus

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        //Alert popups
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().sendKeys("");
        //Authentication popus
        //credentials should be given with url
        // hhtps://usename:password@actualurl

        //Notification popus



    }
}
