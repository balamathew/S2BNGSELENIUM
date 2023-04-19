import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WORKOUT {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\Driversc\\chromedriver111.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();
        int wlink=0;
        int rcode=0;


        List<WebElement> atags=driver.findElements(By.tagName("a"));
        int blinkcount=0;
        String slink="";
        for (WebElement a:atags){

             slink=a.getAttribute("href");
            System.out.println(slink);
            URL u=new URL(slink);

            HttpURLConnection con=(HttpURLConnection) u.openConnection();
            rcode=con.getResponseCode();
            //int wlink = 0;
            if (con.getResponseCode()>=400){
                blinkcount++;

            }
            else
                wlink++;
        }

        System.out.println("broken link in the page is"+blinkcount);
        System.out.println("working links are"+wlink+" "+rcode);

    }
}
