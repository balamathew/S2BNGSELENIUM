package PackageB;



class PrivateClass {

     Protectedclass protectedclass=new Protectedclass();
     PublicClass publicClass=new PublicClass();
     


     private class pc {

         private int i = 0;
         public String s = "public string in defclass";
         protected char c = 'c';
         private String s2 = "private string in defclass";

         void defaul() {

             String s1 = publicClass.s;

             System.out.println("this is private method in private class");
         }

         public void pub() {

             System.out.println("this is public method in private class");
         }

         private void pri() {

             System.out.println("this is pri method in private class");
         }

         protected void prot() {

             System.out.println("this is public method in private class");
         }

         private void fin() {

             System.out.println("this is private method in private class");
         }

     }
}

