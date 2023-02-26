package javatopics.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MAPtoLIST {

    public static void main(String[] args) {


        Map<Integer,String> hm=new HashMap<>();

        hm.put(1,"bhbh");
        hm.put(2,"asdg");
        hm.put(22,"jkl");

        System.out.println(hm);

       List<Integer>hn= hm.keySet().stream().collect(Collectors.toList());
        List<String>ho= hm.values().stream().collect(Collectors.toList());


        System.out.println(hn);
        System.out.println(ho);
    }
}
