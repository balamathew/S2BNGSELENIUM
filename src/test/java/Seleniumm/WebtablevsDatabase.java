package Seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WebtablevsDatabase {

    WebDriver driver;
    Connection con;
    Statement st;
    ResultSet rst;
    List<String> webdata=new ArrayList<>();
    List<String> dbdata=new ArrayList<>();
    List<String> WebColumnName=new ArrayList<>();
    int totrows;
    int totColumn;


@Test
    public void launchapp() throws SQLException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://cosmocode.io/automation-practice-webtable/");
   driver.manage().window().maximize();
 WebElement table= driver.findElement(By.xpath("//table"));
 List<WebElement> rows=table.findElements(By.tagName("tr"));
 totrows=rows.size();
    System.out.println("webrows are"+totrows);
    List<WebElement> column=driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
  totColumn=column.size();
    System.out.println("Webcolumn are"+totColumn);

    for (int i=0;i<column.size();i++){
        WebColumnName.add(column.get(i).getText());
    }
    System.out.println("Webcolumn names are"+WebColumnName);

//   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
//   Statement st=con.createStatement();
//    int j=0;
//
//    String k1 = "create table dbtable(" + WebColumnName.get(j) + " " + "varchar(20)),"+ WebColumnName.get(j++) + " " + "varchar(20)), "+ WebColumnName.get(j++) + " " + "varchar(20)), "+ WebColumnName.get(j++) + " " + "varchar(20)), "+ WebColumnName.get(j++) + " " + "varchar(20)),";
//
//    st.execute(k1);

    for (int i=2;i<totrows;i++) {
        for (int k =2;k< WebColumnName.size();k++) {
          WebElement td=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+k+"]"));
          String td2=td.getText();
            System.out.println("td2 is"+td2);
            //String dy = "insert into dbtable values (,'Dev',80000,'tester2','audi','testing')";

        }
    }

//con.close();
}
    @AfterClass
    public void teardown(){
        driver.quit();

    }









































}
