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

ChromeDriver driver=new ChromeDriver();

        driver.get("https://cosmocode.io/automation-practice-webtable/");

        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1500)","");
        // WebElement table=driver.findElement(By.xpath("//table[@name='cust_123']"));

        WebElement table =driver.findElement(By.tagName("table"));

          List<WebElement> allrows=table.findElements(By.tagName("tr"));
        System.out.println("rows size is "+allrows.size());


          for (WebElement row:allrows){

              List<WebElement> allcell=row.findElements(By.tagName("td"));
              System.out.println("td size is"+allcell.size());

             WebElement sccolumn=allcell.get(1);

             String fc= sccolumn.getText();
              System.out.println("666"+fc);

             if (!fc.startsWith("A")){

                WebElement fcolumn=allcell.get(0).findElement(By.tagName("input"));

                fcolumn.click();

                 System.out.println("ok");



             }


          }
    }
}
