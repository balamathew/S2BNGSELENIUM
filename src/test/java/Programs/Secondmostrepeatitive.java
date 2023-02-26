package Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Secondmostrepeatitive {


    public static void main(String[] args) {
        String d = "aabbcft";

        char[] c = d.toCharArray();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            count = 0;
            for (int j = 0; j < c.length; j++) {

                if (c[i] == c[j]) {

                    count++;
                }
            }
            map.put(c[i], count);
        }
        System.out.println(map);

        Integer mval= Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getValue();
        Integer minval=Collections.min(map.entrySet(),Map.Entry.comparingByValue()).getValue();
        //System.out.println(val);

        for (Character q : c) {

           if (map.get(q)!=mval){
               System.out.println(q);

           }
        }

        }
    }
