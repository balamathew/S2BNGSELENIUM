package javatopics.Streams;

import java.util.Arrays;
import java.util.List;

public class minandmax {

    public static void main(String[] args) {


        List<Integer> li= Arrays.asList(11,12,3,4,5,12,67,89);

      int minn=  li.stream().max((v1,v2)-> v1.compareTo(v2)).get().intValue();

        System.out.println(minn);
    }
}
