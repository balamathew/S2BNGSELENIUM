package Programs;

import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.Map;

public class countcharoccurences  {


    public static void main(String[] args) {

        String a = "abcde";

        a = a.replace(" ", "");

        System.out.println(a);
        char arr[] = a.toCharArray();
        int count = 0;

        Map<Character, Integer> mapp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;


                }
            }

            mapp.put(arr[i], count);

        }
        System.out.println(mapp);
    }

}