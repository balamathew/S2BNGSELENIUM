package javatopics;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {

    public static void main(String[] args) {

       // int [] arr= {55,99,88,76};

       ArrayList<Integer> li=new ArrayList<>();
       li.add(22);
        li.add(22);
        li.add(22);
        li.add(22);

        Iterator i=li.iterator();

        while (i.hasNext()){

            System.out.println(i.next());
        }

    }
}
