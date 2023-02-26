package Programs;

import java.util.Scanner;

public class primenumber {


    public static void main(String[] args) {

        //prime numbers are like they are divisible by 1 and its own number only

        int num = 18;
        int count = 0;




        if (num>1) {
            for (int i = 1; i <= num; i++) {

                if (num%i==0){
                    count++;

                }

            }
            System.out.println(count);
        }
        else {

            System.out.println("not a prime number");
        }
            if (count>=3){

                System.out.println("not a prime number");

            }
            else
                System.out.println("prime number");


    }
}