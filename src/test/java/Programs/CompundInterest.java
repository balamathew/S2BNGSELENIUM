package Programs;

import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {
        double princ_amount=0.0;
        double int_rate=0.0;
        double Time_period=0.0;
        double comp_interest=0.0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter prin amount :");
        princ_amount=sc.nextDouble();
        System.out.println("enter time :");
        Time_period=sc.nextDouble();

        System.out.println("enter int rate:");
        int_rate=sc.nextDouble();

        comp_interest=princ_amount*Math.pow(1+int_rate/100,Time_period);
        System.out.println("");
        System.out.println("compound int"+comp_interest);



    }
}
