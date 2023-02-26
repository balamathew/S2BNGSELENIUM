package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArrays {

    public static void main(String[] args) {


        String [] arr={"banana","Apple","Grapes"};

//        Stream<String> new1=Arrays.stream(arr).sorted();
//        System.out.println(new1);

    List ad=    Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(ad);

    }

}
