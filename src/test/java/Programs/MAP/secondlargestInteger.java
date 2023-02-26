package Programs.MAP;

import java.util.Arrays;
import java.util.Collections;

public class secondlargestInteger {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
int t=0;
        for (int i=0;i<a.length;i++){

            for (int j=0;j<a.length;j++){
                if (a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
int l=0;
        for (int i=0;i<a.length;i++){
            a[i]=l;
            break;
        }


//        int largest=0;
//        for (Integer j:a){
//            largest=j;
//           // System.out.println(largest);
//            break;
//        }
//       for(int p:a){
//          if (p<largest){
//              System.out.println("second largest is"+p);
//              break;
//          }
//
//        }
    }
}