package Programs;

public class RemoveDuplicatewords {


    public static void main(String[] args) {

        String str="hello world world welcome welcome to here";

        int j=0;



        String[] str2= str.split(" ");
        System.out.println("length is"+str2.length);

        for (int i=0;i<str2.length-1;i++) {

            if (!str2[i].equalsIgnoreCase(str2[i+1])) {

                str2[j++]=str2[i];

            }
        }

        //str2[1]=str2[str2.length-1];

        str2[j++]=str2[str2.length-1];


        for (int l=0;l<j;l++){

            System.out.println(str2[l]);

        }

        }

    }


