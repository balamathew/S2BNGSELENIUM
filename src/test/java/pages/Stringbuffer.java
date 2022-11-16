package pages;

import java.util.Random;

public class Stringbuffer {



        public static void main(String[] args) {

            System.out.println(randomalphanumeric(5));


        }

        public static  String randomalphanumeric(int no) {

            String str = "assdwedsr123455";
            Random rand = new Random();

          Stringbuffer sb = new Stringbuffer();


            for (int i = 0; i < no; i++) {

                int randex = rand.nextInt(str.length());



               // sb.append(str.charAt(randex));

            }
            return sb.toString();

        }
    }



