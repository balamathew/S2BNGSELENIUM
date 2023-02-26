package Programs;

import java.util.HashMap;
import java.util.Map;

public class Stringcompress {

    public static void main(String[] args) {

        String a = "abcdeifyiufiufifoiufioufiufu";

        a = a.replace(" ", "");


        char arr[] = a.toCharArray();
        int count = 0;
        int i;

        Map<Character, Integer> mapp = new HashMap<>();
        for ( i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            mapp.put(arr[i], count);

        }
        System.out.println(mapp);

        StringBuilder sb=new StringBuilder();

        for (Map.Entry<Character, Integer> c:mapp.entrySet()){
            sb.append(c.getKey());
            sb.append(c.getValue());

        }
        System.out.println(sb.toString());
    }
}
