package javatopics;


class A{

    void a1(){
        System.out.println("this is from class A");

    }
    void a2(){
        System.out.println("this is from class A");

    }
    void a3(){
        System.out.println("this is from class A");

    }

}
class B extends A {

    void b1(){
        System.out.println("this is from class B");

    }

    @Override
    void a1() {
        System.out.println("this is from class B");
    }
}

public  class UpcastingandDowncasting {

    public static void main(String[] args) {

        A a=new A();
        B b=new B();

        //upcasting - casting the properties of sublass to super class
     a=b;
     a.a1();




        //downcasting - casting the properties of superclass to subclass

//        B b1= (B)a;
//      b1.b1();




    }
}
