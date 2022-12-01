package pages;

import java.util.*;
import java.util.stream.Collectors;

public class LISTtoMAP {


    public static void main(String[] args) {


        List<Students> ls = new ArrayList<>();
      ls.add(new Students(1,"hero",123));


      Map<Integer,String> mp=ls.stream().collect(Collectors.toMap(Students::getIds,Students::getNames));

        System.out.println(mp);


    }

}