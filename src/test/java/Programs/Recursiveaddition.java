package Programs;

public class Recursiveaddition {


    private static int raddition(int[] arr, int z) {
        if (z <= 0) {
            return 0;
        }
        int a=raddition(arr, z- 1) + arr[z - 1];
        System.out.println(a);
        return a;
        /*
        (arr,7-1)+8
         (arr,6-1)+7
          (arr,5-1)+5
           (arr,4-1)+4
            (arr,3-1)+2
             (arr,2-1)+3
              (arr,1-1)+1--1
                (arr,0-1)+0;


         */

    }

    public static void main(String[] args) {
       int arr[] = {1, 3, 2, 4, 5, 7, 8};
        int sum=raddition(arr, arr.length );
        System.out.println(sum);
    }

}
