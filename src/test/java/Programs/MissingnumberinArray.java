package Programs;

public class MissingnumberinArray {
    public static void main(String[] args) {
    int[] ia={2,3,5,6};

    int sum1=0;
    int sum2=0;

    for (int i=0;i<ia.length;i++){

        sum1=sum1+ia[i];
    }
        System.out.println(sum1);
        for (int i=2;i<=6;i++){

            sum2=sum2+i;
        }
        System.out.println(sum2);


        System.out.println("missing number is"+(sum2-sum1));
}
}