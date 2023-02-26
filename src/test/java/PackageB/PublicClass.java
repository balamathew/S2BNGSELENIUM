package PackageB;

public class PublicClass {

    private int i=0;
    public String s="public string in defclass";
    protected char c='c';
    final String s2="finalstring in defclass";

    void defaul(){

        System.out.println("this is default method in public class");
    }
    public void pub(){

        System.out.println("this is public method in public class");
    }
    private void pri(){

        System.out.println("this is pri method in public class");
    }
    protected void prot(){

        System.out.println("this is public method in public class");
    }
    public void fin(){

        System.out.println("this is public method in public class");
    }
}
