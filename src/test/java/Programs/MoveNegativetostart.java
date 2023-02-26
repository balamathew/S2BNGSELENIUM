package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveNegativetostart {
    public static void main(String[] args) {


        int[] a = {11, 12, 13, -1, -4};

        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        for (int c:a){
            if (c<0){
                al.add(c);
            }
            else al2.add(c);

        }
        al.addAll(al2);
        System.out.println(al);
       Object [] s= al.toArray();
        System.out.println(s);













//int narray=0;
//int parray=0;
//for (int i=0;i<a.length;i++){
//
//    if (a[i]<0){
//        narray++;
//    }
//    else
//        parray++;
//}
//        System.out.println(narray);
//        System.out.println(parray);
//int[] neg=new int[narray];
//        int[] pos=new int[parray];
//
//        int l=0;
//        int m=0;
//
//        for (int j=0;j<a.length;j++){
//            if (a[j]<0){
//                neg[l]=a[j];
//                l++;
//            }
//            else {
//                pos[m] = a[j];
//                m++;
//            }
//        }
//        int g=0;
//int []n=new int [pos.length+neg.length];
//     for (int i=0;i<neg.length;i++){
//         n[i]=neg[i];
//         g++;
//
//     }
//        for (int i=0;i<pos.length;i++){
//            n[g++]=pos[i];
//
//
//        }
//        for (Integer q:n){
//
//            System.out.println(q);
//        }

    }
}