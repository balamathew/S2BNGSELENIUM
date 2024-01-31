package Programs;

public class LongestPalindrome {

        public  static void subString(String s){
            for (int i=0;i<=s.length();i++){
                for (int j=i+1;j<=s.length();j++){
                    // System.out.println(s.substring(i,j));
                    String s1=s.substring(i,j);
                    if (s1.length()>1){
                        System.out.println(s.substring(i,j));
                    }

                }
            }
        }

        public static boolean palindrome(String s2){
            boolean b=false;
            StringBuilder sb=new StringBuilder(s2);
            String reversed=sb.reverse().toString();
            if (s2.equals(reversed)) {
                b=true;
                //System.out.println(b);
            }
            return b;
        }

        public  static void longestPalindrome(String s){
            // char[] c=s.toCharArray();
            String previousPalindrome="";
            int previousLength=0;
            for (int i=0;i<=s.length();i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    // System.out.println(s.substring(i,j));
                    String s1 = s.substring(i, j);
                    if(palindrome(s1)&&s1.length()>1&&s1.length()>previousLength){
                        previousPalindrome=s1;
                        previousLength=s1.length();

                    }

                }

            }
            System.out.println(previousPalindrome);
        }

        public static void main(String[] args) {

            //subString("ABCD");
            //palindrome("MADAM");
            longestPalindrome("AAABCDABCCBAMADAMlkjhgfdsasdaasdlkjhgfdsaasdfghjklfghjklXYZZYX");

        /*Write a method to print all sub-strings(two characters or more length) in a given string?
Input:ABCD
OutPut:AB,ABC,ABCD,BC,BCD,CD

write a method to find if a string is palindrome
Input:MADAM
Output:true

Write a method to find longest palindrome in the given input string
Input: AAABCDABCCBAMADAMlkjhgfdsasdaasdlkjhgfdsaasdfghjklfghjklXYZZYX
OutPut:lkjhgfdsaasdfghjkl*/



        }


    }

