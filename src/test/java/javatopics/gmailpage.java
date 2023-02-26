package javatopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailpage {

    WebDriver driver;

    public  void openschrome(String url){
 WebDriver driver=new ChromeDriver();
      // driver.findElement(By.xpath("//*[@id='']")).sendKeys();
       driver.get(url);




    }








}
