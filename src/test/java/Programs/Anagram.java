package Programs;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1="dog";
        String str2="god";


        System.out.println("Strings are anagram??--"+anagrams(str1,str2));

    }

    public static  boolean anagrams(String s1,String s2){

      char[] d1= s1.toCharArray();//java
       char[] d2= s2.toCharArray();//avaj

       Arrays.sort(d2);
       Arrays.sort(d1);


        return Arrays.equals(d1,d2);
    }
}
