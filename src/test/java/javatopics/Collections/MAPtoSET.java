package javatopics.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MAPtoSET {


    public static void main(String[] args) {

        Map<Integer,String> hm=new HashMap<>();

        hm.put(1,"bhbh");
        hm.put(2,"asdg");
        hm.put(22,"jkl");

        System.out.println(hm);

        Set<Integer> st=hm.keySet().stream().collect(Collectors.toSet());
        Set<String> jk=hm.values().stream().collect(Collectors.toSet());

        System.out.println(st);
        System.out.println(jk);



    }
}
