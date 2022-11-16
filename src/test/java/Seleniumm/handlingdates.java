package Seleniumm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class handlingdates {


    public static void main(String[] args) {

        SimpleDateFormat sdf= new SimpleDateFormat("d/mm/yyyy");

        Calendar cal =Calendar.getInstance();

        cal.add(Calendar.DATE,(01));
        cal.add(Calendar.MONTH,(11));
        cal.add(Calendar.YEAR,(2022));

        Date d= cal.getTime();

        System.out.println(d);

        String currentdate=sdf.format(d);

        System.out.println(currentdate);

        }
    }

