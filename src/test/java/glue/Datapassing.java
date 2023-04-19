package glue;

import Pages.Orangehrm;
//import cucumber.api.java.en.*;
import io.cucumber.java.en.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Datapassing {

    WebDriver idriver;
    Orangehrm oh;

    Logger log=Logger.getLogger(Datapassing.class);

    @Given("open chrome and launch the URL as {string}")
    public void open_chrome_and_launch_the_url_as(String string) throws InterruptedException {
        Thread.sleep(5000);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\Driversc\\chromedriver111.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        idriver=new ChromeDriver(chromeOptions);
 oh=new Orangehrm(idriver);
        idriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        idriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



    @Then("username as {string} and password as {string}")
    public  void username_as_and_password_as(String string, String string2) throws InterruptedException {
        oh.entercred(string,string2);
        oh.loginbtn();
        log.info("Data passed as string");




    }

    @Then("passing datas with only datavalues")
    public void passing_datas_with_only_datavalues(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        idriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      List<String> data=dataTable.asList(String.class);
      String uname=data.get(0);
        String password= data.get(1);
        oh.entercred(uname,password);
        oh.loginbtn();
        log.info("Data passed as only values");


    }

    @Then("passing datas with header")
    public void passing_datas_with_header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        idriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       Map<String,String> dm= dataTable.asMap(String.class,String.class);
       String uname1 = dm.get("username");
       String password1= dm.get("password");

        oh.entercred(uname1,password1);
        oh.loginbtn();
        log.info("Data passed with header");

    }

    @Then("passing data as Examples with username  as {string} and password as {string}")
    public void passing_data_as_examples_with_username_as_and_password_as(String string, String string2) throws InterruptedException {
        idriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       oh.entercred(string,string2);
        oh.loginbtn();
       log.info("Data passed with examples");

    }

}
