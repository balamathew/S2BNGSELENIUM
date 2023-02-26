package javatopics;

import org.openqa.selenium.JavascriptExecutor;

class b extends abstractclass{


    @Override
    public void helo() {
        System.out.println("this is implementation of abstract method from class A");
    }
}

class c{


    public static void main(String[] args) {
        b f=new b();
        f.helo();
        f.nonabstract();
    }
}


public abstract class abstractclass  {


    public  abstract void helo();

    void nonabstract(){

        System.out.println("this is non abstract");
    }


}

