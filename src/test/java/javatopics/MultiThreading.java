package javatopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiThreading extends Thread{

      WebDriver driver;
      String browsertype;



    public MultiThreading(String browsertype){
this.browsertype=browsertype;


    }

    public  void run() {

        try {
            selectbrowser(browsertype);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


        public void selectbrowser(String browsertype){

            if (browsertype.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");

                 driver=new ChromeDriver();
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            } else if (browsertype.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\Drivers\\chromedriver105.exe");

                 driver=new ChromeDriver();
                driver.get("https://www.scientecheasy.com/2019/11/xpath-contains-text.html/");




        }
    }

    public static void main(String[] args) {

        //MultiThreading mt=new MultiThreading("chrome");

        Thread t1=new MultiThreading("chrome");
        Thread t2=new MultiThreading("firefox");
        t1.start();
        t2.start();

    }












}

