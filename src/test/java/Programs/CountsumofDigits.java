package Programs;

public class CountsumofDigits {

    public static void main(String[] args) {
        int k=123;

        int sum=0;

       String s=Integer.toString(k);

      for (int i=0;i<s.length();i++){

          char c=s.charAt(i);
          sum=sum+Integer.parseInt(String.valueOf(c));

      }


        System.out.println(sum);
    }


}
