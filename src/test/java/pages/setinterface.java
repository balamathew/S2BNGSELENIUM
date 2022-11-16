package pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class setinterface {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(122);
        al.add(11);


        Iterator<Integer> it = al.iterator();

        while (it.hasNext()){

            System.out.println(it.next());

        }

        }
    }