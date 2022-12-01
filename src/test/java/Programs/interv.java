package Programs;

import java.util.HashMap;
import java.util.Map;

public class interv {

    public static void main(String[] args) {
        String str="avaJ to emocleW World! olleH";

        String str2="Hello world! Welcome to java";
        str2=str2.replace(" ","");

        char[] s=str2.toCharArray();
        int j=0;

        for (int i=0;i<str2.length()-1;i++){

            if (s[i]!=s[i+1]){

               s[j++]=s[i];
            }

        }

        System.out.println(s);

    }

}
