package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Proper{


    public void getp() throws IOException {
        FileInputStream fi = new FileInputStream("objectrepo.properties");
        Properties prop = new Properties();
           prop.load(fi);





    }



    public void kj(){


       // propvalue(s)
    }
}
