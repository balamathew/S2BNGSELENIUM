package Seleniumm;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.PaneInformation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class exceltestdata{

    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public exceltestdata(String filepath){

        try {
            File file=new File(filepath);
            FileInputStream fis=new FileInputStream(file);
            wb=new XSSFWorkbook(fis);
            wb.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
public String getdata(int no,int rownumber,int column) throws IOException {
    sheet1=wb.getSheetAt(no);
        String data=sheet1.getRow(rownumber).getCell(column).getStringCellValue();


    wb.close();
    return data;
}

public String iteratingrow(int o) throws IOException {
        int column=0;
        sheet1=wb.getSheetAt(o);
String cellvalue="";
    try {
        for (int i=0;i<=10;i++) {

           //Optional s= Optional.ofNullable(sheet1.getRow(0).getCell(i).getStringCellValue());
            if (sheet1.getRow(0).getCell(i).getStringCellValue()!=null) {
                column++;
                System.out.println("there");
            }

        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    for (int i=0;i<=column;i++){
                cellvalue = sheet1.getRow(1).getCell(i).getStringCellValue();
                System.out.println(cellvalue);
                System.out.println("no of columns are"+column);
            }


    wb.close();
    return cellvalue;
}



}

