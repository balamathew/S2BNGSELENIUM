package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatewords {


    public static void main(String[] args) {

        String str1="hello world hello world welcome welcome to here";

        String [] str=str1.split(" ");

        Set<String> st=new HashSet<>();
        for (int i=0;i<str.length;i++){
            st.add(str[i]);
        }


        System.out.println(st.toString());

















//        Set<String> st= new HashSet<>();
//        for (int i=0;i<str.length;i++){
//
//            st.add(str[i]);
//           }
//
//        System.out.println(st);
//        st.toString();
       }
        }




