package javatopics.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<String> s=  Arrays.asList("kjkjk","swsw","swsw","swsw");

       List to= s.stream().filter(w->!w.contains("s")).collect(Collectors.toList());

        System.out.println(to);
    }
}
