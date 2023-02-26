package javatopics.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LISTtoSET {

    public static void main(String[] args) {

        ArrayList<Object> al=new ArrayList<>();

        al.add("jbhjbjb");
        al.add(122);
        al.add(-1222);
        al.add(2.122);
        al.add(true);
        al.add('s');

        System.out.println(al);

        Set<Object> st=new HashSet<>(al);


        System.out.println(st);

        }

    }

