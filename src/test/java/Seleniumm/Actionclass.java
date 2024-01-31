package Seleniumm;

import org.bouncycastle.cert.crmf.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

    public static void main(String[] wse) {

        WebDriver driver=new ChromeDriver();
       driver.findElement(By.xpath("")).sendKeys(Keys.chord(Keys.CONTROL,Keys.chord("h")));


Actions act=new Actions(driver);
// drag and drop
        WebElement src=driver.findElement(By.xpath("hb"));
        WebElement trg=driver.findElement(By.xpath("hb"));
act.dragAndDrop(src,trg);

//normal copy paste
      src.sendKeys(Keys.CONTROL);
      src.sendKeys("A");
      src.sendKeys(Keys.CONTROL);
      src.sendKeys("c");

      //copy paste usomg action class

        act.keyDown(Keys.CONTROL);
                act.sendKeys("c");
                act.keyUp(Keys.CONTROL);
                act.build().perform();

                act.sendKeys(Keys.TAB);

                act.sendKeys(Keys.chord(Keys.CONTROL,"A"));

                Keys.chord(Keys.CONTROL,"A");

                act.doubleClick(src).perform();
                act.contextClick().perform();
                act.moveToElement(trg).perform();

               //
        // Keys.chord(Keys.Pr)
















    }
}
