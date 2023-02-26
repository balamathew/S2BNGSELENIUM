package javatopics.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SETtoLIST {

    public static void main(String[] args) {


        Set<Integer> st=new HashSet<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(44);
        st.add(5);

        //System.out.println(st);

        List<Integer> ls=new ArrayList<>(st);

        System.out.println(ls);
    }
}
