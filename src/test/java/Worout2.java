//import io.cucumber.java.sl.In;
//import javatopics.CompateTO;
//import org.apache.commons.collections.map.HashedMap;
import org.apache.logging.log4j.Logger;
import org.apache.poi.sl.draw.geom.GuideIf;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Programs.Stringpermutation.StringPermut;

public class Worout2 {

    public static void main(String[] args) throws IOException {

      String s1="Welcome to hello world";

     char [] c=s1.toCharArray();
     Map<Character,Integer> map=new HashMap<>();

     for (Character c1:c){
         if (map.get(c1)==null){
             map.put(c1,1);
         }
         else
             map.put(c1,map.get(c1)+1);
     }

        System.out.println(map);

     Character s=Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
        System.out.println(s);

        for (Map.Entry<Character,Integer> p:map.entrySet()){
            if (p.getValue()>s){
                System.out.println(p.getKey());
            }
        }
    }

}







