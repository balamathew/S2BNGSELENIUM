package Programs;

public class Findingelement {

    public static void main(String[] args) {

        int [] k={11,22,33,5,6,7};

        for (int i=0;i<k.length-1;i++){

            if (k[i]==99){

                System.out.println("element found");
                break;
            }
            System.out.println("element not found");

        }
    }

}
