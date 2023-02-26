package Programs.Pateerns;

public class pattern {

    public static void main(String[] args) {
//triangle
//        for (int i=1;i<=5;i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(" *");
//
//            }
//            System.out.println();
//        }
int n=5;

//      //decrease  triangle
//        for (int i=1;i<=5;i++) {
//            for (int j=i; j<=5; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

//right triangle

        for (int i=1;i<=n;i++){//1,
            for (int j=i;j<=n;j++){

                System.out.print(" ");

            }
            for (int j=1;j<=i;j++){


                System.out.print("* ");

            }
            System.out.println();
        }






















































    }

}