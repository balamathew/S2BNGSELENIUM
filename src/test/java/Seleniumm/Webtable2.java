package Seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtable2 {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");

WebDriver driver=new ChromeDriver();

        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)","");


         // WebElement table=driver.findElement(By.xpath("//table[@name='cust_123']"));

          List<WebElement> allrows=driver.findElements(By.tagName("//table[@name='cust_123']//tr"));


          for (int i=0;i<allrows.size();i++){

              List<WebElement> allcell=driver.findElements(By.tagName("//table[@name='cust_123']//tr//td"));

             WebElement fcolumn=allcell.get(1);

             String fc= fcolumn.getText();
              System.out.println("666"+fc);

//             if (fc.equalsIgnoreCase("USA")){
//
//                WebElement checkbox=allcell.get(0).findElement(By.tagName("input"));
//
//                checkbox.click();
//
//
//
//             }


          }
    }
}
