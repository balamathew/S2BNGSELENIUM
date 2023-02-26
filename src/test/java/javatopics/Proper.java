package javatopics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Proper{


    public  String getdata(String keyname) {
        String keyvalue;
        try {
            FileInputStream fi = new FileInputStream("objectrepo.properties");
            Properties prop = new Properties();
            prop.load(fi);
            keyvalue = prop.getProperty(keyname);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return keyvalue;
    }



    public void kj(){


       // propvalue(s)
    }
}
