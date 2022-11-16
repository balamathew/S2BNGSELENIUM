package pages;

import java.util.HashMap;



public class Hashmap {


  public static HashMap<String, String> getcrecentialsmap() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("debit account", "12345");
    hm.put("payee name ", "bala");
    hm.put("payer name", "bala2");
    hm.put("payment amount", "1000");

//    Object String;
//    HashMap<String, String> HashMap;
    // return HashMap<String,String>;
    return hm;
  }

    public static void main(String[] args) {

      System.out.println(getcrecentialsmap().get("payer name"));

    }
}
