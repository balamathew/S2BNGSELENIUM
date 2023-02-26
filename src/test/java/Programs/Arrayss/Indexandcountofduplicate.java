package Programs.Arrayss;

import java.util.HashMap;
import java.util.Map;

public class Indexandcountofduplicate {

    public static void main(String[] args) {
        String s1="Welcomcec";
        int count=0;
Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<s1.length();i++){

            if (s1.charAt(i)=='c'){
                System.out.println("i is present in indexes"+i);
                count++;

            }
        }
        System.out.println("C is present"+count+"times");
    }
}
