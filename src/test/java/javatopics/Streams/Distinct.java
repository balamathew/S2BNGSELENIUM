package javatopics.Streams;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {

        List<String> s=  Arrays.asList("kjkjk","swsw","swsw","swsw");

        s.stream().distinct().forEach(System.out::println);

Object [] c=s.stream().toArray();


    }

}
