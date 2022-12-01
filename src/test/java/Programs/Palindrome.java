package Programs;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        // palindrome means reverse of a number is same as the actual

        // int pal = 12345;

        // Scanner sc=new Scanner(System.in);

        int ds = 111;

        // int pal = 0;

        int rev = 0;

        while (ds!= 0) {

            rev = rev * 10 + ds % 10;
            ds = ds / 10;
        }

        System.out.println(rev);
        System.out.println(ds);
       // int gs=ds;

        if(ds==rev){


            System.out.println("the number is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}