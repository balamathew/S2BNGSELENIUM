package Programs;

import java.util.Arrays;
import java.util.Collections;

public class ZerostoFrontandend {

    public static void main(String[] args) {
        int [] a = {11, 23, 0, 0, 2, 3, 0,0,0,4};
        int k=a.length-1;

        //move zeros to front
        for (int i=a.length-1;i>=0;i--){
            if (a[i]!=0){

                a[k]=a[i];
                k--;


            }
        }

        for (int i=0;i<=k;i++){

            a[i]=0;


        }

        for (int s:a){
            System.out.println("final is "+s);
        }

        //move zeros to end


//        for (int i=0;i<a.length;i++){
//            if (a[i]!=0){
//
//               a[k]=a[i];
//               k++;
//
//            }
//        }
//        for (int i=k;i<a.length;i++){
//
//                a[k++]=0;
//
//            }
//
//        for (int s:a){
//            System.out.println(s);
//        }















//        String x ="";
//        Collections.sort(Arrays.asList(a));
//       for (int s:a){
//           System.out.print(s);
//
//       }
//        System.out.println(" ");
//StringBuilder sb=new StringBuilder();
//       for (int d:a){
//           sb =sb.append(d);
//       }
//
//       sb.reverse();
//        System.out.println(sb);
//    }
    }
}