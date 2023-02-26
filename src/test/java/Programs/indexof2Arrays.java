package Programs;

import java.util.ArrayList;

public class indexof2Arrays {
    public static void main(String[] args) {
        int [] a={11,12,13,14};
        int [] b={21,22,23,24};
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        ArrayList<Integer>bl1=new ArrayList<>();
        ArrayList<Integer>bl2=new ArrayList<>();

        for (int i=0;i<a.length;i++){
            if (i%2==0){
                al1.add(a[i]);
            }
            else
                al2.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            if (i%2==0){
                bl1.add(b[i]);
            }
            else
                bl2.add(b[i]);
        }

        System.out.println(al1.size());
        System.out.println(al2.size());
        System.out.println(bl1.size());
        System.out.println(bl2.size());
      for (int i=0;i<al1.size();i++){
          al1.add(bl1.get(i));
      }
        for (int i=0;i<al1.size();i++){
            al2.add(bl2.get(i));
        }

        System.out.println(al1);
        System.out.println(bl1);

    }
}
