package Seleniumm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtablle {
Selectclass sl=new Selectclass();
waits wai=new waits();
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");
      WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://letcode.in/table");
        driver.manage().window().maximize();
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//        String whnf=driver.getWindowHandle();
//        Set whls=driver.getWindowHandles();
//    driver.switchTo().window("https://letcode.in/table");
//        Thread.sleep(3000);
//    driver.switchTo().newWindow(WindowType.TAB);
//        Thread.sleep(3000);
//    driver.switchTo().newWindow(WindowType.WINDOW);
//    driver.get("https://www.amazon.com/");
    //driver.

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)","");
        List<WebElement>rows=driver.findElements(By.xpath("//table[@name='table']/tbody/tr"));
       // List <WebElement>columns=driver.findElements(By.xpath("//table[@name='table']/thead/tr/th"));

for (WebElement row:rows) {

    List<WebElement> allcells = row.findElements(By.tagName("td"));

    WebElement cells = allcells.get(0);

String secondcolumn= cells.getText();

if (secondcolumn.equalsIgnoreCase("raj")||secondcolumn.equalsIgnoreCase("man")||secondcolumn.startsWith("Ch")){

    WebElement checkbox=allcells.get(3).findElement(By.tagName("input"));
    checkbox.click();

}

}


    }
}
