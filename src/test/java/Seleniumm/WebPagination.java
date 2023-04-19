package Seleniumm;

import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebPagination {

static WebDriver driver;

   static ArrayList<String> al=new ArrayList<>();
    public static void fwait(WebElement ele){
        Wait<WebDriver> fw=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class);
        fw.until(ExpectedConditions.elementToBeClickable(ele));
    }

    public static void main(String[] args) throws InterruptedException {
       // Logger log=Logger.
       ChromeOptions options=new ChromeOptions();
       options.setPageLoadStrategy(PageLoadStrategy.EAGER);
       driver=new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver.exe");
        driver.get("https://demo.opencart.com/admin/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Wait wait=new WebDriverWait(driver,20);
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[contains(@id,'username')]")).sendKeys("demo");
        driver.findElement(By.xpath("//*[contains(@id,'pass')]")).sendKeys("demo");
        driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
        driver.findElement(By.xpath("//*[@class='btn-close']")).click();
//        Alert al=  driver.switchTo().alert();
//      al.dismiss();
        driver.findElement(By.xpath("//*[@href='#collapse-4']")).click();

        driver.findElement(By.xpath("//a[text()='Orders']")).click();
        js.executeScript("window.scrollBy(0,1000)","");
////*[contains(text(),'Showing')]
        Actions act=new Actions(driver);
        WebElement pagebar=driver.findElement(By.xpath("//*[contains(text(),'Showing')]"));
       // act.moveToElement(pagebar);
       String allpages= pagebar.getText();

        String noofpages= allpages.substring(pagebar.getText().indexOf("(")+1,allpages.indexOf("Pages")-1);
        System.out.println("total pages"+noofpages);

for (int i=1;i<=Integer.parseInt(noofpages);i++){

    List<WebElement> rows= null;
    try {

        rows = driver.findElements(By.xpath("//table//tbody//tr"));
    } catch (Exception e) {
        rows = driver.findElements(By.xpath("//table//tbody//tr"));
    }

    System.out.println("no of rows in page"+i+"is"+rows.size());
    for (WebElement row:rows){
//        fwait(row);
        js.executeScript("return document.readyState").toString().equals("complete");
       List<WebElement> cells= row.findElements(By.tagName("td"));

       String status=cells.get(4).getText();

       if (!status.equalsIgnoreCase("Canceled")){
           //wait.until(ExpectedConditions.elementToBeClickable(cells.get(1)));

           fwait(cells.get(1));
           System.out.println("table are"+cells.get(1).getText()+"  "+cells.get(2).getText()+" "+cells.get(3).getText());
           al.add(cells.get(1).getText()+" "+cells.get(2).getText()+" "+cells.get(3).getText());
           System.out.println("al is"+al);
       }

    }
int pageno=i+1;
    if (pageno<=Integer.parseInt(noofpages)){
        WebElement page = driver.findElement(By.xpath("//*[@class='pagination']//li//a[text()=" + pageno + "]"));
        // wait.until(ExpectedConditions.elementToBeClickable(page));
        // Thread.sleep(2000);
        //act.moveToElement(page);
      fwait(page);
        try {
            page.click();
            js.executeScript("return document.readyState").toString().equals("complete");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

        System.out.println("Arraylist is"+al);
    }


}
