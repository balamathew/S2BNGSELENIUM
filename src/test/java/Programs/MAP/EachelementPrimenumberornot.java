package Programs.MAP;

import java.util.HashMap;
import java.util.Map;

public class EachelementPrimenumberornot {

    public static void main(String[] args) {
        int[] s = {11, 13, 17,22,56,87,23,29,31,37};
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        //int i = 0;

        for (int i = 0; i < s.length; i++) {
            count = 0;
            if (s[i] != 0) {
                for (int j = 1; j <= s[i]; j++) {
                    if (s[i] % j == 0) {
                        count++;

                    }
                }
            }
            map.put(s[i], count);
        }

        for (Integer d : map.keySet()) {

            if (map.get(d) >= 3) {
                System.out.println(d + " " + "is not a prime number");
            } else
                System.out.println(d + " " + "is  a prime number");
        }

    }
}