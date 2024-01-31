package javatopics;

import org.openqa.selenium.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class Trycatchh {

    public static void main(String[] args) {

        try{
            int i=2;
            int i1 = i / 0;
            File d=new File("");
            FileInputStream fis=new FileInputStream(d);

            Connection con= DriverManager.getConnection("","","");
            con.createStatement().executeQuery("");
            con.close();

        }

        catch (ArithmeticException e){

            System.out.println("this is Arithematic  Exception block");
        }
        catch (NoSuchElementException e){

            System.out.println("this is common Exception block");
        }
        catch (StaleElementReferenceException e){

            System.out.println("this is common Exception block");
        }
        catch (ElementClickInterceptedException e){

            System.out.println("this is common Exception block");
        }
        catch (ElementNotInteractableException e){

            System.out.println("this is ElementNotSelectableException block");
        }
        catch (ElementNotSelectableException e){

            System.out.println("this is ElementNotSelectableException block");
        }
        catch (InvalidElementStateException e){

            System.out.println("this is InvalidElementStateException block");
        }
        catch (FileNotFoundException e){

            System.out.println("this is FileNotFoundException block");
        }
        catch (IOException e){

            System.out.println("this is IOException block");
        }
        catch (StringIndexOutOfBoundsException e){

            System.out.println("this is StringIndexOutOfBoundsException block");
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("this is ArrayIndexOutOfBoundsException block");
        }
        catch (IndexOutOfBoundsException e){

            System.out.println("this is IndexOutOfBoundsException block");
        }

        catch (SQLException e){

            System.out.println("this is SQLException block");
        }
        catch (TimeoutException e){

            System.out.println("this is TimeoutException block");
        }
        catch (Exception e){

            System.out.println("this is Master Exception block");
        }
    }
}
