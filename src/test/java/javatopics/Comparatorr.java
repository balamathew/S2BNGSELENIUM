package javatopics;

import java.util.*;
import java.util.stream.Collectors;

public class Comparatorr {

    public static void main(String[] args) {

        Map<String, Integer> al = new HashMap<>();
        al.put("Apple", 10000);
        al.put("Dell", 2000);
        al.put("ACer", 1000);
        al.put("hp", 6000);
        // System.out.println(al);

        List li = al.values().stream().collect(Collectors.toList());
        List li2 = al.keySet().stream().collect(Collectors.toList());

        Comparator<Integer> ci = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 < o2)
                    return 1;
                else
                    return -1;
            }
        };

    //Collections.sort(li,ci);
    Collections.sort(li);


       for (Object k:li){

           System.out.println(k);
       }
    }
}
