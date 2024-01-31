package Seleniumm;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alllocators {

//    below(): Web element located below for the specified element.
//            toLeftOf() : Target web element which is present to the left of specified element.
//    toRightOf(): Target web element which is presented to the right of a specified element.
//            above(): Web element located above for the specified element.
//            near() : Target web element which is away(approx. 50 pixels) from the specified element.

    public  WebDriver driver;
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

   @BeforeMethod
    public  void launchapp() throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","" +
               "");
driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
Thread.sleep(5000);
   } //starts-with
@Test(priority =-10)
        public void startswith() throws InterruptedException {
        driver.findElement(By.xpath("//*[starts-with(@name,'us')]")).sendKeys("strtaswith");
        Thread.sleep(3000);

    String attval=    driver.findElement(By.xpath("//*[starts-with(@name,'us')]")).getAttribute("value");
    String css=    driver.findElement(By.xpath("//*[starts-with(@name,'us')]")).getCssValue("value");


    Dimension d=driver.findElement(By.xpath("//*[starts-with(@name,'us')]")).getSize();
   Point location= driver.findElement(By.xpath("//*[starts-with(@name,'us')]")).getLocation();

        System.out.println("Factors are"+d+attval+location+css);
    }
        //ends-with
        //And
        @Test
        public void and()
        {
            driver.findElement(By.xpath("//*[@name='username' and @placeholder='Username']")).sendKeys("Andxpath");
            System.out.println("And success");
        }
        //or
        @Test
        public void OR()
        {
            driver.findElement(By.xpath("//*[@name='username' or @placeholder='Username']")).sendKeys("orxpath");
            System.out.println("OR success");
        }
        //contains
    @Test
        public void contains()
        {
            driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
            System.out.println("Contains success");

        }


    @Test(priority = -4)//css selector
//id =#id
//    Tag and ID	css=tag#id
//    Tag and Class	css=tag.class
//    Tag and Attribute	css=tag[attribute=value]
//    Tag, Class, and Attribute	css=tag.class[attribute=value]
        public void CSSattributevalue()
        {
            //css=tag.class[attribute=value]
            driver.findElement(By.cssSelector("input[name=password]")).sendKeys("CSS selector");
            System.out.println("css success");
        }

    @Test(priority = -3)
        public void partiallink()
        {
            driver.findElement(By.partialLinkText("Forgot")).click();
            System.out.println("partial success");
        }

    @Test(priority = -2)
        public void linktext()
        {
            driver.findElement(By.linkText("Forgot your password? ")).click();
            System.out.println("linktext success");
        }

        @Test(priority = -1)
        public void text()
        {

            driver.findElement(By.xpath("//*[text()='Forgot your password? ']")).click();
            System.out.println("text success");
        }
        @Test//child
        public void child()
        {
            driver.findElement(By.xpath("//*[@class='orangehrm-login-slot']/child::h5")).getText();
            System.out.println("child success");
        }
        //following
        public void following()
        {
            driver.findElement(By.xpath("//*[@class='oxd-form-row']/following::input")).sendKeys("following");
            System.out.println("following success");
        }
        @Test//descendant
        public void descendant()
        {
            driver.findElement(By.xpath("//*[@class='oxd-form-row'][1]/descendant::input")).sendKeys("descendant");
            System.out.println("Descendant success");
        }
        @Test//parent
        public void parent()
        {
            driver.findElement(By.xpath("//*[@class='orangehrm-login-logo']/parent::div//a[4]")).sendKeys("parent");
            System.out.println("Parent success");
        }
        @Test//ancestor
        public void ancestor()
        {
            driver.findElement(By.xpath("//*[@class='orangehrm-login-logo']/ancestor::div[1]/descendant::input[2]")).sendKeys("orxpath");
            System.out.println("ancestor success");
        }

        @Test//name
        public void name()
        {
            driver.findElement(By.xpath("//*[@name='username']")).sendKeys("name");
            System.out.println("name success");

        }
    @Test
    public void preceding()
    {
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("name");
        System.out.println("name success");

    }
    @Test
    public void precedingsibling()
    {
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("name");
        System.out.println("name success");

    }
    @Test
    public void followingsibling()
    {
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("name");
        System.out.println("name success");

    }




}
