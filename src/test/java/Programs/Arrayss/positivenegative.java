package Programs.Arrayss;

public class
positivenegative {


    public static void main(String[] args) {

        int[] a = {-10, -10, 12, -12, 20, -12, 30, -12};
        int ncount = 0;
        int pcount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                ncount++;
            } else
                pcount++;

        }
        System.out.println(ncount);
        System.out.println(pcount);

        int[] narray = new int[ncount];
        int[] parray = new int[pcount];
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {

                narray[j] = a[i];
//                if (j==ncount)
//                    break;
                j++;
            } else {

                parray[k] = a[i];

                k++;
            }
    }
        for (int o:narray){

            System.out.print("narray"+o+" ");



        }
        for (int l:parray){

            System.out.print("parray"+l+" ");



        }
    }
}
