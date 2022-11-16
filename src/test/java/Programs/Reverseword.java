package Programs;

public class Reverseword {


    public static void main (String[] args){

        String str= "boney kapoor khan";
        String w="";
        str+=" ";

        for (int i=0;i<=str.length();i++){
            char d=str.charAt(i);
            if (!Character.isWhitespace(d)){
                w=w+d;
            }
          else {
                System.out.println(w);
              w="";
            }

        }

    }
}
