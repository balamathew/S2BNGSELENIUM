package Seleniumm;

import java.sql.*;
import java.util.*;

public class Connectionss {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");

       Statement st= con.createStatement();
     // st.executeQuery("update city set name ='balaaa' where id=99");
    ResultSet ss= st.executeQuery("Select * from city where id=1;");

       List<Map<String,String>> dbdatas=new ArrayList<>();
       while(ss.next()){
       // String h = dbdatas.get(0);
           System.out.println(dbdatas.get(1));
               //break;
       }
con.close();
        //System.out.println(dbdatas);

    }
}
