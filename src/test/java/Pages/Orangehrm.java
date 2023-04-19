package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Orangehrm {

   public static WebElement username;
   public static WebElement password;
   public static WebElement submit;

   public  WebDriver driver;


public Orangehrm(WebDriver rdriver){
    this.driver=rdriver;
}

By uname= By.name("username");
By pass=By.name("password");
By lbtn=By.xpath("//*[@type='submit']");

  public void entercred(String u1name,String pass1){

      driver.findElement(uname).sendKeys(u1name);
      driver.findElement(pass).sendKeys(pass1);

  }
   public void loginbtn(){
     driver.findElement(lbtn).click();
   }
}
