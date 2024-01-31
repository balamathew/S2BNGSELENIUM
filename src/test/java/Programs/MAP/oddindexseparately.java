package Programs.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class oddindexseparately {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};//2,4,3,5
        int sum1=0;
        int sum2=0;
       // int sum3=0;

        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
       // ArrayList<Integer>al3=new ArrayList<>();

//        for (int i=0;i<a.length;i++){
//            if (i%2==0){
//                al1.add(a[i]);
//            }
//            else if (i%2!=0){
//                al2.add(a[i]);
//
//            } else if (i==0) {
//                al3.add(a[i]);
//            }
//        }
//        for (int i=0;i<al1.size();i++){
//          sum1=sum1+al1.get(i);
//
//
//      }
//        System.out.println(sum1);
//        for (int i=0;i<al2.size();i++){
//           if (i%2==0){
//               sum2=sum2+al2.get(i);
//           }
//        }
//        for (int i=0;i<al3.size();i++){
//            if (i%2==0){
//                sum3=sum3+al3.get(i);
//            }
//            }
//
//
//        System.out.println(sum2);
//        System.out.println(sum1+sum2+sum3);

        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if (a[i]%2==0){
              map.put(a[i],i);
          }
          else
             map.put(a[i],i);
       }

        System.out.println(map);
        for (Map.Entry<Integer,Integer>h:map.entrySet()){
            if (h.getValue()%2==0){
                al1.add(h.getKey());
            }
            else {
                al2.add(h.getKey());
            }
        }




    }
}
