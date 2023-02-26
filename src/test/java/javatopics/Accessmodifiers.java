package javatopics;

public  class
Accessmodifiers {

private int i=22;
    protected  void A() {


        System.out.println("im protected method in public class A");


    }

    final protected void fin(){
        final String s="Final";
        System.out.println("im fin method in protected class A");
    }
}
    class BB extends C{
         void hi() {

            System.out.println("im default method in default class b");

        }
        public void n0(){

            System.out.println("im public method in public class b");
        }
    }

    class C{
        protected void hello(){
            System.out.println("im protected method in default class c");

        }

        private void yes(){

            System.out.println("im private method in  default class c");
        }
    }

    class D{

    public static void main(String[] args) {

        Accessmodifiers a = new Accessmodifiers();
        BB b = new BB();
        C c = new C();
a.fin();




    }
    }



