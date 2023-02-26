package javatopics.AccessModi;

 class PRIclsPUBvarPROvarFINmetDEFmeth {

     private class hello{

         int i=2;
          protected String k="abc";

         protected String s1(){

             return k;
         }
         final void s2(){

             System.out.println("final void");
         }

        void s3(){
            System.out.println("default");
         }




     }

}
