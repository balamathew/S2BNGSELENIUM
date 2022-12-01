package Programs;

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharinstring {

    public static void main(String[] args) {

        String str="aasdfghjkkl";
        int count=0;

     char[] d=   str.toCharArray();
        Map<Character,Integer> mapp=new HashMap<>();
     for (int i=0;i<d.length;i++){
         count=0;
         for (int j=0;j<d.length;j++){

             if (d[i]==d[j]){
                 count++;//1+1
             }

         }
       //  Map<Character,Integer> mapp=new HashMap<>();

         mapp.put(d[i],count);//a=1
        // System.out.println(mapp);
     }
        System.out.println(mapp);
    }
}
