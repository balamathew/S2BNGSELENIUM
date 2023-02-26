package javatopics;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatingObjects {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {


        // By new keyword
        CreatingObjects ob=new CreatingObjects();
        ob.selectanydate1(0,0,0);

        //By Cloning

//        CreatingObjects creatingObjects=new CreatingObjects();
//        CreatingObjects co=(CreatingObjects) creatingObjects.clone();
//        co.selectanydate1(0,0,0);

        //By reflection

        CreatingObjects co=(CreatingObjects) Class.forName("javatopics.CreatingObjects").newInstance();
        co.selectanydate1(0,0,0);

        //By class loader

        Object obj1=CreatingObjects.class.getClassLoader().loadClass("javatopics.CreatingObjects").newInstance();



        //By constructor

        Class<CreatingObjects> obj=CreatingObjects.class;
        Constructor<?> constructor= obj.getDeclaredConstructor();
        CreatingObjects cob=(CreatingObjects) constructor.newInstance();
        cob.selectanydate1(0,0,0);


//De-serialisation

        FileInputStream fos=new FileInputStream("");
        ObjectInputStream oos=new ObjectInputStream(fos);
   CreatingObjects cv=(CreatingObjects) oos.readObject();
   cv.selectanydate1(0,0,0);






    }

        public void selectanydate1(int day, int month , int year){
            System.out.println(day+" "+month+" "+year+" ");

        }
    }

