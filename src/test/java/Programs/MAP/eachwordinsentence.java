package Programs.MAP;

import java.util.HashMap;
import java.util.Map;

public class eachwordinsentence {

    public static void main(String[] args) {
        String s="this success is chennai not chennai Then verify login success or not is";
s=s+" ";
        int count=0;

        String [] s1=s.split(" ");
          int f=s1.length;

        System.out.println(f);
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<s1.length;i++){
            count=0;
            for(int j=0;j<s1.length;j++){

                if(s1[i].equalsIgnoreCase(s1[j])){
                    count++;

                }
                map.put(s1[i],count);
            }
        }
        System.out.println(map);

    }
}
