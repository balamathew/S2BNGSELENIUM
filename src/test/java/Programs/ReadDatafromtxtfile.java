package Programs;

import org.apache.poi.examples.xssf.usermodel.ScatterChart;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDatafromtxtfile {

    public static void main(String[] args) {


        try {
            FileReader fr = new FileReader("C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\java\\Programs\\file.txt");
            BufferedReader br=new BufferedReader(fr);

          String gb= String.valueOf(br.read());
            System.out.println(gb);
            br.close();

        } catch (Exception e) {

        }
    }
}

