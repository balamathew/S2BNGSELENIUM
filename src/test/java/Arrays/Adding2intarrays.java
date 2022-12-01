package Arrays;

public class Adding2intarrays {


    public static void main(String[] args) {

        int []a={10,20,30,40,50,60};
        int []b={20,30};

        //int[] d=a.length>b.length?a:b;
                int[] c=new int[a.length];
                int count=0;


        for ( int i=0;i<b.length;i++){

            c[i]=a[i]+b[i];
            count++;


        }

        for (int j=2;j<a.length;j++){

            c[count++]=a[j];

        }



    for (int g:c){

        System.out.println(g);
    }
    }
}
