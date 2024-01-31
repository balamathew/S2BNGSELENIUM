package Programs.MAP;

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharinstring {

    public static void main(String[] args) {

        String str="Balasubramani";

        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
     }
    }
//}
