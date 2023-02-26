package Programs.MAP;

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharinstring {

    public static void main(String[] args) {

        String str="aaasdfggghjkkl";
        int count=0;
        int dcount=0;

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

     for (Character f:mapp.keySet()) {
         if (mapp.get(f) > 1) {
             System.out.println("character" + f + "is repeated" + mapp.get(f));
         }

     }

     }
    }
//}
