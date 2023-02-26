package Programs;

import java.lang.reflect.Array;
import java.util.*;

public  class Specificwordreverse {

    public static void main(String[] args) {

        String s1 = "Hi hello how are you welcome";
     String[] s2=s1.split(" ");

   //char [] c=s1.toCharArray();

    for (int i=0;i<s2.length;i++){
        char [] c=s2[i].toCharArray();
        if (s2[i].contains("hello")){
            System.out.print(s2[i]);
        }
        else {
            for (int j=c.length-1;j>=0;j--){
                System.out.print(c[j]);
            }
        }
        System.out.print(" ");
    }

//for (int i=s2.length-1;i>=0;i--){
//    char [] c=s2[i].toCharArray();
//    if (!s2[i].contains("hello")) {
//        for (int j = c.length-1; j >= 0; j--) {
//            System.out.print(c[j]);
//        }
//    }
//    else if (s2[i].contains("hello"))
//    {
//        System.out.print(s2[i]);
//    }
//    System.out.print(" ");
//}
    }
}
