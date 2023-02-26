package Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatainTextfile {

    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("C:\\Users\\Balam\\IdeaProjects\\S2BNGSELENIUM\\src\\test\\java\\Programs\\file.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("hi hello how are you");
        bw.newLine();
        bw.write("hi hello how are you");
        bw.write("hi hello how are you");
        bw.close();
    }
}
