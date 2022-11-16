package Programs;

public class ReverseString {



    public static void main (String[] args){

        String str= "boneykapoor";
        String w =" ";

        for (int i=0;i<=str.length();i++)
        {

            char d=str.charAt(i);
            w=d+w;

        }
        System.out.println(w);
    }
}
