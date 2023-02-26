package javatopics;

import org.openqa.selenium.support.PageFactory;

public class ConstructorOverloading {

int s=2;
    public  ConstructorOverloading(String s){

        System.out.println("this is Constructor overloading");

    }

    public  ConstructorOverloading(int s){

        System.out.println(this.s);
    }

    public ConstructorOverloading(){
        this(2);

        System.out.println("Constructor overloading test");



    }
}
