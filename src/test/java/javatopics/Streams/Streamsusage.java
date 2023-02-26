package javatopics.Streams;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsusage {

    public static void main(String[] args) {
        /*
        Filter  ----> Sorted,Count,distinct,collect,min,max,limit,reduce,to array
        Map
 */

        List<Integer> li=Arrays.asList(10,12,13,56,23,22,10,12,56);
//filter and convert the result to list
  //   li.stream().filter(a->a%2!=0).collect(Collectors.toList()).forEach(System.out::println);

     //remove duplicates
        li.stream().distinct().forEach(s-> System.out.println(s));

        //sort in ascending order
        li.stream().sorted().forEach(q-> System.out.println("sorted order is "+q));

//apply filter and print the remaining
  li.stream().filter(a->a.toString().startsWith("5")).forEach(d-> System.out.println("starts with alone"+d));


//Map
        List<String> si=Arrays.asList("wsw","hvhvbh","vghvgh","gvgvg");
      si.stream().forEach(a-> System.out.println("upper case is"+a.toUpperCase()));

      si.stream().map(g->g.toUpperCase()).forEach(k-> System.out.println("uppercase by map"+k));

      //reverse by comparator

        li.stream().sorted(Comparator.reverseOrder()).forEach(d-> System.out.println("reverse order"+d));

    }
}
