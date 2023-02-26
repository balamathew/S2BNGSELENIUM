package javatopics.ConstructorChaining;

public class ClassB extends  ClassA{

    String q="this is variable in class b";

    public  ClassB(){
      //  String x1 = this.x;
        //super.ClassAmethod(4,"");
        super(2,"");

        System.out.println("non par cons in class B");
    }

    public ClassB(String A,int b){
this();
this.q=A;
this.ClassBmethod(4,"");
this.ClassAmethod(2,"");

        System.out.println("parameterised in class b constr");
    }

    public void ClassBmethod(int a,String b){


        System.out.println("this is method in class B");
    }
}
