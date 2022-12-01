package Arrays;

public class Merge2arrays {
    public static void main(String[] args) {


        int[] a = {1, 2, 2, 3, 3};

        int[] b = {5, 6, 7, 8, 9};

        int[] c = new int[a.length + b.length];

        int count = 0;

        for (int i = 0; i < a.length; i++) {


            c[i] = a[i];
            count++;
        }

        for (int j = 0; j < b.length; j++) {

            c[count++] = b[j];
        }

        for (int f : c) {

            System.out.println(f);
        }
    }
}