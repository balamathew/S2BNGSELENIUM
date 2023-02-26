package javatopics.Lambda;

import java.util.List;

public class Predicatee {

        String name;
        int id;
        int rollno;

        public Predicatee(String name, int id, int rollno) {
            this.name = name;
            this.id = id;
            this.rollno = rollno;


        }
    }

    class d{

        public static void main(String[] args) {

          Predicatee student=new Predicatee("name",1,2);
         int h= student.id;
            System.out.println(h);

        }

    }

