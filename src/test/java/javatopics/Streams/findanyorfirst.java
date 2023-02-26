package javatopics.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findanyorfirst {

    public static void main(String[] args) {

        List<String> s=  Arrays.asList("kjkjk","swsw","swsw","swsw");

      Optional<String> sw= s.stream().findAny();

        System.out.println(sw.get());


    }
}
