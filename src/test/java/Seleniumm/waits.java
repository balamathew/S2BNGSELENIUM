package Seleniumm;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class waits {

    public static void main(String[] args) {

//        //implicitwait
//
        WebDriver driver =new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        //explicit wait
//
        WebDriverWait wait = new WebDriverWait(driver,20);
        //wait.until(ExpectedConditions.elementToBeClickable())

        //fluent wait

        Wait <WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

       // wait.until(Function)
        //wait.until(ExpectedConditions.)
    }
}
