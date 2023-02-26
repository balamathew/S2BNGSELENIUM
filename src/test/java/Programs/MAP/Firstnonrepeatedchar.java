package Programs.MAP;

import java.util.HashMap;
import java.util.Map;

public class Firstnonrepeatedchar {

    public static void main(String[] args) {
        String s="dcnjuikmjbbaakkh";
boolean r=false;
        char[] c=s.toCharArray();
       Map<Character,Integer> hm=new HashMap<>();
       for (Character j:c){
           if (hm.get(j)==null){
               hm.put(j,1);
           }
           else
               hm.put(j,hm.get(j)+1);
       }
        //System.out.println(hm);

       for (Character k:c){

           if(hm.get(k)==1){


               System.out.println("first non repetitive char is"+k+hm.get(k));
               break;
           }
       }
    }
}
