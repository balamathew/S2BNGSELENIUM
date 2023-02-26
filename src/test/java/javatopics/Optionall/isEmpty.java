package javatopics.Optionall;

import javatopics.Proper;
import org.openqa.selenium.WebElement;

import java.util.Optional;

public class isEmpty {
static Proper proper=new Proper();
  static   WebElement ele;
    public static void main(String[] args) throws NoSuchMethodException {
//empty
        Optional<String> o=Optional.empty();
        //optional.of
        Optional<String> o1=Optional.of("");
//optional.offnullable
//        Optional.ofNullable(proper.getdata("epwd")).ifPresent(s -> {
//ele.sendKeys(s);

//                });
//orElse
//      Optional<String>c=  Optional.ofNullable(proper.getdata("pwd"));
//      System.out.println(c.orElse("abc"));
//orelseget
//      Optional<String>k=  Optional.ofNullable(proper.getdata("pwd"));
//        System.out.println( k.orElseGet(()-> proper.getdata("login")));

        //orelsethrow
//        Optional<String>c=  Optional.ofNullable(proper.getdata("qpwd"));
//      System.out.println(c.orElseThrow(NoSuchMethodException::new));

      //filter
        Optional<String>c1=  Optional.ofNullable(proper.getdata("pwd"));
     c1.filter(a->!a.isEmpty()).ifPresent(d-> System.out.println("filter is"+d));

//map


        }




    public  void g1(){

       // System.out.println(proper.getdata("abc"));

        ele.sendKeys(proper.getdata("jk"));
    }
}
