package Programs;

public class ReverseString {



    public static void main (String[] args){

        String str= "boneykapoor";
        String w =" ";

        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());

//        for (int i=0;i<=str.length();i++)
//        {
//
//            char d=str.charAt(i);
//            w=d+w;
//
//        }
       // System.out.println(w);
    }
}
