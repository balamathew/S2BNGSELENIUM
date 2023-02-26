package Programs;

public class Stringpermutation {
    public static void main(String[] args) {
        StringPermut("abc");
    }
    public static void StringPermut(String s) {
        //System.out.println("permutation of string is" + s);
        StringPer("", s);
    }

    private static void StringPer(String perm, String s) { //perm=0,s=abc
        if (s.length() == 0) {
            System.out.println(perm);
        } else {
            for (int i=0;i<s.length();i++){
                StringPer(perm+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
            }

        }
    }


}