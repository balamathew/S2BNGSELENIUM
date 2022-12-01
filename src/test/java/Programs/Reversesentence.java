package Programs;

public class Reversesentence {

    public static void main(String[] args) {


        String s1="Hi hello how are you";

        String s="";

        //  int k=s1.length();

        String [] rev= s1.split(" ");

        for (int i=rev.length-1;i>=0;i--){
            s+=rev[i]+" ";


        }

        System.out.println(s);

    }
}
