package javatopics.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortreversesort {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(11, 12, 13, 12, 1, 20);

        //li.stream().sorted().filter(s->s.toString().endsWith("2")).forEach(d-> System.out.println(d));
//sort
li.stream().sorted().forEach(a-> System.out.print(a));
        System.out.println();
//reverse sort
        li.stream().sorted(Comparator.reverseOrder()).forEach(a-> System.out.print(a));

    }
}
