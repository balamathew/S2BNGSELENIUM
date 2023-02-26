package javatopics.Streams;

import java.util.HashSet;
import java.util.Set;

public class matches {
    public static void main(String[] args) {
        Set<String> st=new HashSet<>();

        st.add("hello");
        st.add("sello");
        st.add("kello");
        st.add("vello");
        st.add("wello");
        st.add("iello");
//anymatch
        boolean t=st.stream().anyMatch(value-> value.startsWith("h"));

        System.out.println("anymatch"+t);

        //allmatch
        boolean t1=st.stream().allMatch(value-> value.startsWith("h"));

        System.out.println("all match is"+t1);
        //nonematch
        boolean t2=st.stream().noneMatch(value-> value.startsWith("h"));

        System.out.println("none match is"+t2);
    }
}
