package Programs.Arrayss;

public class Containsduplicateornot {
    public static void main(String[] args) {

        int a []={11,1,3,4,5,6,21};
      // boolean s=false;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println("contains duplicate");
                    break;
                }
                else
                    System.out.println("no duplicate");

            }
        }

    }
}
