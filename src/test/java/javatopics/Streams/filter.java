package javatopics.Streams;

import java.util.Arrays;
import java.util.List;

public class filter {

    public static void main(String[] args) {

      List<String> s=  Arrays.asList("kjkjk","swsw","swsw","swsw");

      s.parallelStream().filter(w->!w.contains("s")).forEach(c-> System.out.println(c));


    }
}
