package Programs;

public class fibonnaci {

    public static void main(String[] args) {

        //fibonacci series is : 0,1,1,2,3,5,8,13,21.....
        int sum=0;
        int n1=0;
        int n2=1;
        System.out.println(n1+" "+n2);
        for(int i=2;i<=10;i++){

            sum= n1+n2;//1
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;


        }

    }
}
