package Programs;

public class Ascii {

    public static void main(String[] args){

        // need to find the ascii code of the letter or character

        String c="akjfugjgijgi";


        for (int i=0;i<=c.length();i++) {

            char f=c.charAt(i);

            System.out.println(f+" "+(int) f);

        }


    }
}
