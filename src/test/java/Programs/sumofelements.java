package Programs;

import java.util.Arrays;

public class sumofelements {

    public static void main(String[] args) {
        int [] q={1,2,3,4,5};
        //int [] q1={1,2,3,4,5};

        int sum =0;
        for (int i=0;i<q.length;i++){

            sum=sum+q[i];
        }

        System.out.println(sum);


    }

}
