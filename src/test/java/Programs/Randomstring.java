package Programs;

import java.util.Random;

public class Randomstring {


    public static void main(String[] args) {
String s="chgcjgchgchyfjhvjviufvjgyuyrytetrewewewqwrewtrwtwtrxgfxhchgc";
int length=5;
        Random rand=new Random();
StringBuilder sb=new StringBuilder();
char v=' ';
String jj="";
        for (int i=0;i<=s.length();i++){

            
            rand.nextInt(length);
             v= s.charAt(i);

             jj= sb.append(v).toString();


        }
        System.out.println(jj);
    }
}
