package Programs;

public class Recursiveaddition {


    private static int raddition(int[] arr, int len) {
        if (len <= 0) {
            return 0;
        }
        return raddition(arr, len - 1) + arr[len - 1];
    }

    public static void main(String[] args) {
       int arr[] = {1, 3, 2, 4, 5, 7, 8};
        int sum=raddition(arr, arr.length );
        System.out.println(sum);
    }

}
