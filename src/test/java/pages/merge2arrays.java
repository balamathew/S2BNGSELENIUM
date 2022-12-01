package pages;

public class merge2arrays {


    public static void main(String[] args) {


        int[] arr={1,2,3,5,88};
        int[] arr2={4,6,7,8,9};
        int[] arr3=new int[arr.length+arr2.length];
        int count=0;

        for (int i=0;i<arr.length;i++){

            arr3[i]=arr[i];
            count++;

        }




        for (int j=0;j<arr2.length;j++){

            arr3[count++]=arr2[j];
        }
        for (int r: arr3){

            System.out.print(r);
        }


    }
}
