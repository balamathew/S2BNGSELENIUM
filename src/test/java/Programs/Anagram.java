package Programs;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1="dog";
        String str2="god";
        char[] d1= str1.toCharArray();//java
        char[] d2= str2.toCharArray();//avaj

        Arrays.sort(d2);
        Arrays.sort(d1);


        System.out.println("Strings are anagram??--"+Arrays.equals(d1,d2));

    }


}
