package javatopics;

import Seleniumm.exceltestdata;

import java.io.IOException;

public class Excelread2 {


    public static void main(String[] args) throws IOException {
        exceltestdata excel=new exceltestdata("C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\java\\Excelpath\\Exceltestdata.xlsx");


        //System.out.println(excel.getdata(0,0,0));

       excel.iteratingrow(0);




    }
}
