package Seleniumm;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Connectionss {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

     //   String url="jdbc:mysql://localhost:3306/world","root","root");

//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");

       Statement st= con.createStatement();
       ResultSet ss=st.executeQuery("select * from city");

       List<String> dbdatas=new ArrayList<String>();

       while(ss.next()){


       // String h = dbdatas.get(0);
           System.out.println(ss.getString("ID"));
           break;

       }

con.close();
    }
}
