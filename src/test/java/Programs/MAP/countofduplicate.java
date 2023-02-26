package Programs.MAP;

import java.util.HashMap;
import java.util.Map;

public class countofduplicate {

    public static void main(String[] args) {
        //String a="qajvqhjbkvugiuieubjbcjbeiubciuebviouc";

        String a="jhvjhvjhvjvjhvjhvjhqwertyuiop";
      char [] c= a.toCharArray();
        int count=0;
        Map<Character,Integer>hm=new HashMap<>();
        for (int i=0;i<c.length;i++){
count=0;
            for (int j=0;j<c.length;j++){
                if (c[i]==c[j]){
                    count++;
                    hm.put(c[i],count);
                }
               //hm.put(c[i],count);
            }
        }
        System.out.println(hm);
    }
}