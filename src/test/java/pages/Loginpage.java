package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Loginpage {

    WebDriver driver;

    public static  void main(String[] args) throws InterruptedException {

        selectanydate( -2, 0 , 0);




    }

    public static void selectanydate(int day, int month , int year) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();



        driver.get("https://prism.aspiresys.com/PMO/myprojects");
        driver.manage().window().maximize();

//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
//wait.until(ExpectedConditions.elementToBeClickable(null))

        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("balasubramani.kumar@aspiresys.com");

        driver.findElement(By.xpath("//*[@type='button']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("India@aspire123");


        driver.findElement(By.xpath("//*[@type='submit']")).click();




        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='SCB_Testing_Backlog_Squad']"))).click();


//ac.waitforelementtoclickable(By.xpath("//*[text()='Timesheet']")).
        WebElement timesheet=driver.findElement(By.xpath("//*[text()='Timesheet']"));
        wait.until(ExpectedConditions.elementToBeClickable(timesheet));
        timesheet.click();

//Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Daily']"))).click();


//date to select
        driver.findElement(By.xpath("//*[@class='ui-datepicker-trigger']")).click();
        WebElement monthtitle3=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/span[1]"));

//WebElement yeartitle=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/span[2]"));

        SimpleDateFormat sdf = new SimpleDateFormat("d/MMM/YYYY");

        Calendar cal =Calendar.getInstance();
        cal.add(Calendar.DATE, day);
        cal.add(Calendar.MONTH,month);
        cal.add(Calendar.YEAR, year);

        Date date = cal.getTime();

        String currentdate= sdf.format(date);


        String [] arr= currentdate.split("/");
        String day1 = arr[0];
        String month1 = arr[1];
        String year1 = arr[2];


        System.out.println("Day is "+ day1+System.lineSeparator()+month1+System.lineSeparator()+year1);

        while (true)
        {
            String monthtitle=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/span[1]")).getText();
            System.out.println( monthtitle);
            String yeartitle=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/span[2]")).getText();
            System.out.println(yeartitle);
            if(monthtitle.startsWith(month1)&&yeartitle.equals(year1)) {


                break;
            }
            else
//driver.findElement(By.xpath("//*[text()='Next']")).click();
                driver.findElement(By.xpath("//*[text()='Prev']")).click();
        }



        List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//td"));

        for (WebElement datelist:alldates)
        {
            if (datelist.getText().contains(day1))
            {
                datelist.click();
                break;
            }



        }

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@placeholder='Type Your Summary' and @role ='textbox']")).sendKeys("sc");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@role='listbox']//li[2]//a")).click();
//Thread.sleep(5000);
// for (WebElement tsk:task)
// {
// if (tsk.getText().contains("#3 : SCB Testing"))
// {
// wait.until(ExpectedConditions.elementToBeClickable(tsk));
// tsk.click();
// break;
// }
//
// }

        Thread.sleep(10000);

        WebElement work=driver.findElement(By.xpath("//*[@id='timesheet_table']//tr[1]//td[4]/select"));

        wait.until(ExpectedConditions.elementToBeClickable(work));
        work.click();



        driver.findElement(By.xpath("//*[@id='timesheet_table']//tr[1]//td[4]/select/option[2]")).click();


        try {
            driver.findElement(By.xpath("//*[@id='timesheet_table']//tr[1]//td[5]/select")).click();
        }
        catch(StaleElementReferenceException e)
        {
            System.out.println(e);
        }

        driver.findElement(By.xpath("//*[@id='timesheet_table']//tr[1]//td[5]/select/option[4]")).click();

        driver.findElement(By.xpath("//*[@class='timesheet-duration ui-control ui-duration ui-mandatory dynamic-time-entry hasTimeEntry']")).sendKeys("09:00");

        driver.findElement(By.xpath("//*[@class='timesheet-comments ui-control ui-mandatory' and @style ='None']")).sendKeys("Test execution");

        driver.findElement(By.xpath("//*[@id='submit_all']")).click();
        driver.switchTo().alert().accept();

        driver.getPageSource();

        if (driver.getPageSource().contains("Submitted Successfully"))
        {
            System.out.println("Report submitted");
        }

    }
}

