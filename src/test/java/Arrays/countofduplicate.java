package Arrays;

public class countofduplicate {

    public static void main(String[] args) {


        String[] str = {"w", "w", "w", "w", "w", "w", "w"};

        int count = 0;

        for (int i=0;i<str.length-1;i++){

            if (str[i]==str[i+1]){

                count++;
            }

        }
        System.out.println("number of duplicates"+count);

    }
}