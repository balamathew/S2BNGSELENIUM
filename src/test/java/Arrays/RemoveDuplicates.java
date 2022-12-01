package Arrays;

public class RemoveDuplicates {


   // int [] intg=new int[10];
    public static void main(String[] args) {
        int [] intg= {11,2,2,3,4,5,5,7};

        int j=0;

        for (int i=0;i<intg.length-1;i++){
           if (intg[i]!=intg[i+1]){
               intg[j++]=intg[i];//1,2,3,4
           }
        }
       // System.out.println(j++);
intg[j++]=intg.length-1;
      //  System.out.println(j++);



for (int k=0;k<j;k++){

    System.out.println(intg[k]);

}

    }
}
