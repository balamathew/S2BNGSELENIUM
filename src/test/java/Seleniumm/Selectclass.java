package Seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass extends commonlocatormethods{

    WebDriver driver= new ChromeDriver();
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        WebElement web=driver.findElement(By.name(""));
        Select select = new Select(web);

        select.selectByIndex(0);
        select.selectByValue("");
        select.deselectByVisibleText("");
    }
}
