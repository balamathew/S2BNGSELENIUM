package javatopics.Collections;

import javatopics.ConstructorOverloading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collectionsclasss {

    //static ConstructorOverloading co=new ConstructorOverloading(2);

    public static void main(String[] args) {

        List<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(10);
        al.add(0,33);
        al.remove(0);


        LinkedList<Integer> ll=new LinkedList<>(al);
      //  int s = co.s;

        System.out.println(ll);

    }
}
