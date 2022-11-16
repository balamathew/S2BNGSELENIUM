package pages.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.gmailpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class glueclassnew {
    gmailpage  gm=new gmailpage();
   public WebDriver driver1;

//    @Given("User opens the chrome browser with URL as {string}")
//    public void user_opens_the_chrome_browser_with_URL_as(String string) throws SQLException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\Driversc\\chromedriver.exe");
//
//        gm.openschrome(string);
//        driver.manage().window().maximize();
//
//        Connection con = DriverManager.getConnection("","","");
//
//
//    }

    @Given("User opens the chrome browser with URL as {string} and enter below credentials")
    public void useropensurl(String string, io.cucumber.datatable.DataTable dataTable) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\Driversc\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

          driver.manage().window().maximize();

        List<Map<String, String>> data=dataTable.transpose().asMaps(String.class,String.class);

        Map<String, String> datamap = dataTable.asMap(String.class,String.class);


        Optional.ofNullable(datamap.get("username")).ifPresent(pwd->{

            driver.findElement(By.xpath("//+[@id='email']")).sendKeys(pwd);
            System.out.println("pasword is"+ pwd);

        });

        Optional.ofNullable(datamap.get("password")).ifPresent(pswd->{

            driver.findElement(By.xpath("//+[@id='pass']")).sendKeys(pswd);

        });





    }

//    @Then("clicks on the login button")
//    public void clicks_on_the_login_button() {
//
//    }


}




