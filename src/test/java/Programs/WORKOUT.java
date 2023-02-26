package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WORKOUT {

    public static void main(String[] args) {
        String s="i am a boy";

        String [] s2=s.split(" ");
        String rev="";
        String rev2="";
        StringBuilder sb=new StringBuilder(rev);

        for(int i=s2.length-1;i>=0;i--){

            rev+=s2[i]+" ";

        }

        for(int j=0;j<rev.length();j++){

            char f=rev.charAt(j);
            if(!Character.isWhitespace(f)){
                rev2=f+rev2;


            }
            else {
                System.out.println(rev2);
                rev2 = "";
            }
        }

    }
}