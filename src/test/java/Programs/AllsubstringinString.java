package Programs;

public class AllsubstringinString {

    public static void main(String[] args) {
        String s="abc";

        for (int i=0;i<=s.length();i++){
            for (int j=i+1;j<=s.length();j++){
               String d= s.substring(i,j);
                System.out.println(d);
            }
        }

    }
}
