package Seleniumm;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Defaultdownloadlocation {

    public static void main(String[] args) {

        Map<String,Object> hm=new HashMap<>();
        hm.put("Folder","path");


        ChromeOptions options=new ChromeOptions();
      //  options.getExperimentalOption("prefs",hm);
    }
}
