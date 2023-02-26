package Seleniumm;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.support.PageFactory;

import java.io.*;

public class PDFREAD {


    public  void main1() throws IOException {

        File file =new File("C:\\Users\\Balam\\Downloads\\pdf.pdf");


        PDDocument document=PDDocument.load(file);

      //  to count the no.of pages

        document.getPages().getCount();

       // to read for specific page
        PDFTextStripper pts=new PDFTextStripper();
        pts.setStartPage(1);
        pts.setEndPage(1);
        //to read the entire text
        pts.getText(document);


        document.close();


    }
}
