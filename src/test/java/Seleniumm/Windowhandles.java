package Seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandles {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
         Thread.sleep(4000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)","");
        driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();

      Set<String> st= driver.getWindowHandles();

        Iterator<String>it=st.iterator();

        String pwindow=it.next();
        String cwin=it.next();

        System.out.println(pwindow);
        System.out.println(cwin);

        driver.switchTo().window(pwindow);
        driver.close();



    }
}
