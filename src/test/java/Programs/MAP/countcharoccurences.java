package Programs.MAP;

import org.openqa.selenium.JavascriptExecutor;

import java.util.*;
import java.util.stream.Collectors;

public class countcharoccurences {


    public static void main(String[] args) {

        String a = "bbbbcccaaf";

        a = a.replace(" ", "");


        char arr[] = a.toCharArray();
        int count = 0;
        int i;
        int sm=0;

        Map<Character, Integer> mapp = new HashMap<>();
        for (i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            mapp.put(arr[i], count);

        }
        System.out.println(mapp);

List<Integer>li=mapp.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(li);

        for (int j=0;j<li.size();j++) {
            if (li.get(j) != li.get(j + 1)) {
                sm=li.get(j+1);
                System.out.println(sm);
                break;
            }
        }

        for (Character k:arr){
            if (mapp.get(k)==sm){
                System.out.println("2nd most repeated"+k);
            }
        }



    }
}