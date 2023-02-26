package PackageA;

import PackageB.Protectedclass;

class Defaultclass {

    Protectedclass protectedclass=new Protectedclass();

     private int i=0;
     public String s="public string in defclass";
     protected char c='c';
     final String s2="final string in defclass";

     void defaul(){

         System.out.println("this is default method in default class");

     }
     public void pub(){

         System.out.println("this is public method in default class");
     }
     private void pri(){

         System.out.println("this is pri method in default class");
     }
     protected void prot(){

         System.out.println("this is public method in default class");
     }
     final void fin(){

         System.out.println("this is final method in default class");
     }
}
