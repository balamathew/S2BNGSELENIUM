package Programs.MAP;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Lastnonrepetetive {

    public static void main(String[] args) {
        String s="aabbccdefgh";
        char [] c= s.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for (Character a:c){

            if (map.get(a)==null){

                map.put(a,1);
            }
            else
                map.put(a,map.get(a)+1);
        }
        System.out.println(map);

        Integer d=Collections.min(map.entrySet(),Map.Entry.comparingByValue()).getValue();

        for (Character z:c){
            if (map.get(z)==d){
                System.out.println(z+" "+map.get(z));
                break;
            }
        }
    }
}
