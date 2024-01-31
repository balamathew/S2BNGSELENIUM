package javatopics.Streams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestclassLionsbot {
    WebDriver driver;

    LionsbotLogin lionsbotLogin;
@Test
    public void login(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        lionsbotLogin=new LionsbotLogin(driver);
        driver.get("https://asia.lionsbot.cloud/");
        lionsbotLogin.setBotid();
        lionsbotLogin.setPassword();
        lionsbotLogin.checkrules();
        lionsbotLogin.clickonLogin();

    }
}
