package Seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Brokenlinks {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();


        driver.get("https://www.amazon.com/");

        List<WebElement>blinks=driver.findElements(By.tagName("a"));

        System.out.println("number of links"+blinks.size());

int brokenl=0;
        for (WebElement g:blinks){
            String url=g.getAttribute("href");

            if (url==null||url.isEmpty()){

                System.out.println("not a broken link");
                continue;
            }
            URL link=new URL(url);

            try {
                HttpURLConnection httpcon= (HttpURLConnection) link.openConnection();

                httpcon.connect();

                if(httpcon.getResponseCode()>=400){
    
                    System.out.println("broken link is "+httpcon.getResponseCode());
                    brokenl++;
                }
                else {
                    System.out.println("valid link");
                }
            } catch (Exception e) {

            }
            System.out.println(" brokenlink"+brokenl);




        }
        System.out.println("number of broken links"+ brokenl);


    }
}
