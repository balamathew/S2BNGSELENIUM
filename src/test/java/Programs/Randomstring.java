package Programs;

import java.util.Random;

public class Randomstring {


    public static void main(String[] args) {

int length=5;
        Random rand=new Random();
StringBuilder sb=new StringBuilder();
char v=' ';
        for (int i=0;i<=length;i++){

            
            rand.nextInt(length);
             v= sb.charAt(i);

            String jj= sb.append(v).toString();

            System.out.println(jj);
        }
    }
}
