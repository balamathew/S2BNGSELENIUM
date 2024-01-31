package Programs.MAP;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countofhigestword {

    public static void main(String[] args) {

        String s1="aabbccdde";

Map<Character,Integer> hm=new HashMap<>();

char []c=s1.toCharArray();

for (Character s:c){

    if (hm.get(s)==null){

        hm.put(s,1);
    }
    else
        hm.put(s,hm.get(s)+1);
}
       System.out.println(hm);
        Character key=Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey();
        Character key2=Collections.min(hm.entrySet(),Map.Entry.comparingByValue()).getKey();

        //System.out.println(g);
        System.out.println("occurences is"+hm.get(key)+key);


    }
}
