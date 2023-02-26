package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Insertelement {

    public static void main(String[] args) {
       Integer [] a={11,13,14,15};
       String [] s={"am","a","boy"};
       List<Integer> al=new ArrayList<>(Arrays.asList(a));
   al.add(1,12);


        System.out.println(al);
    }
}
