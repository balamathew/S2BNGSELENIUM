package Programs.Arrayss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {


   // int [] intg=new int[10];
    public static void main(String[] args) {
        String str1="aabcdeefghh";
int acount= str1.length();
int ucount=0;
        StringBuilder sb=new StringBuilder();

       str1.chars().distinct().forEach(d->sb.append((char)d));
       String unique= sb.toString();
        System.out.println(unique);



        Set<Character> st=new HashSet<>();
        for (int i=0;i<str1.length();i++){
            st.add(str1.charAt(i));
        }

        Iterator it=st.iterator();

        while(it.hasNext()){
            ucount++;
            it.next();
        }
int duplicate =acount-ucount;
        System.out.println("dup is"+duplicate);
        int k=1123212343;

        String new1=Integer.toString(k);

        StringBuilder sb2=new StringBuilder();

        new1.chars().distinct().forEach(r->sb2.append((char)r));
        System.out.println(sb2);







    }
}
