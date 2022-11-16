package Programs;

public class datatypeconvertion {

    public static void main(String[] args) {

        int t=12345;

        String b="98989889";

        char f='b';


        //converting string to int

        int g=Integer.parseInt(b);
        System.out.println(g);

        //converting int to string

        String y=Integer.toString(g);
        System.out.println(y);

        //converting String to char

     char d=y.charAt(0);
        System.out.println(d);


        //converting int to char

        char l= (char) g;
        System.out.println(l);

        //char to int

        int gg=l;
        System.out.println(gg);
        //char to String

        //String hh=String.valueOf(l);

        String hn=Character.toString(l);

        System.out.println(hn);

        // converting charactre array to string

        char[] n={'a','f','r','e','d','s','u'};

        String yo= String.valueOf(n);

        System.out.println(yo);






    }
}
