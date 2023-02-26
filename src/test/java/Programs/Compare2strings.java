package Programs;

public class Compare2strings {
    public static void main(String[] args) {
        String s1="12345";
        String s2="12";
        for (int i=0;i<s2.length();i++){

            char h=s2.charAt(i);
            if (s1.contains(String.valueOf(h))){
                s1=s1.replace(String.valueOf(h),"");
            }
        }
        System.out.println(s1);
    }
}
