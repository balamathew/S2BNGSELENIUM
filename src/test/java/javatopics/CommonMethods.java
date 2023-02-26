package javatopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    WebDriver driver;
   WebDriverWait wait=new WebDriverWait(driver, 20);

    public By findbylocator(String locatortype, String locatorvalue){

        By by=null;
        try {

            switch (locatortype.toUpperCase().trim()){
                case "ID":
                    by=By.id(locatorvalue);
                    break;
                case  "xpath":
                    by=By.xpath(locatorvalue);
                    break;
                case "css":
                    by=By.cssSelector(locatorvalue);
                    break;
                case "linktext":
                    by=By.linkText(locatorvalue);
                    break;
                case "PARTIALLINKTEXT":
                    by=By.partialLinkText(locatorvalue);
                    break;
                case "NAME":
                    by=By.name(locatorvalue);
                    break;
                default:
                    by=null;
                    break;
            }


        } catch (Exception e) {

        }

        return by;

    }


    public void waitforelementtobeclickable(String element){
        ////*[@name='email']~xpath
        String[] split= element.split("~");
        String locatortype=split[1];
        String locatorvalue=split[0];
        By locator= findbylocator(locatortype,locatorvalue);
//wait.until(ExpectedConditions.elementToBeClickable(locator));


    }

    public void sendkeys(String element,String value){
        ////*[@name='email']~xpath
        String[] split= element.split("~");
        String locatortype=split[1];
        String locatorvalue=split[0];
        By locator= findbylocator(locatortype,locatorvalue);
       WebElement element1 =wait.until(ExpectedConditions.elementToBeClickable(locator));
        element1.sendKeys(value);


    }

    public void click(String element){
        ////*[@name='email']~xpath
        String[] split= element.split("~");
        String locatortype=split[1];
        String locatorvalue=split[0];
        By locator= findbylocator(locatortype,locatorvalue);
        //wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }

}
