package javatopics.ConstructorChaining;

public class ClassA {

    int d=35;
    String x="this is variable in class A";
    public ClassA(){

        System.out.println("non par cons in class A");
    }

    public ClassA(int a,String b){

        System.out.println(" par cons in class A");
    }
    public void ClassAmethod(int a,String b){

        System.out.println("this is method in class A");
    }
}
