package javatopics.Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LionsbotLogin {


    WebDriver driver;



    public LionsbotLogin(WebDriver driver){
        this.driver=driver;
       PageFactory.initElements(driver,this);

    }

    @FindBy(name="username")
    WebElement d;



    public void setBotid() {
        //driver.findElement(By.name("username")).sendKeys("Username");
        d.sendKeys("username");
    }

    public void setPassword() {
        driver.findElement(By.name("password")).sendKeys("password");
    }

    public void checkrules() {
        driver.findElement(By.className("ant-checkbox-input")).click();
    }

    public void clickonLogin() {
        driver.findElement(By.xpath("//span[text()='Log In']")).click();
    }

}
