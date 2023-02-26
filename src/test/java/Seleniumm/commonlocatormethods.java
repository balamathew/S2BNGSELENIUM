package Seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class commonlocatormethods {

    WebDriver driver=new ChromeDriver();

    public By findbylocator(String locatortype,String locatorvalue){

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


      // locator="//*[@id='ui']~xpath";

       String[] split= element.split("~");

       String locatortype=split[1];
       String locatorvalue=split[0];


      By locator= findbylocator(locatortype,locatorvalue);

      driver.findElement(locator);

//        WebDriverWait wait=new WebDriverWait();
//
//      wait.until(ExpectedConditions.elementToBeClickable(locator));






    }

    public void usingelemnt(){


        String locg="";

        waitforelementtobeclickable(locg);
    }




}
