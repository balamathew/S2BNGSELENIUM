package javatopics;

import org.testng.Assert;
import org.testng.annotations.Test;


public class fblogin {

@Test
  //@Given("Login to fb with url")
    public void login_to_fb_with_url_as() {
//

      System.out.println("login successful");
    }
    @Test
   // @Then("enter emailid as {string} and password as {string}")

    public void enter_emailid_as_and_password_as(){

        System.out.println("user name and password entered");
        Assert.assertEquals("123","234","Actual and expectd not matched");

  }
    @Test
 // @Then("click on login button")
    public void click_on_login_button() {

      System.out.println("clicked");

    }

//@Given("Check the internet connection before each scenario")
//public void check_the_internet_connection_before_each_scenario() {
//    System.out.println("internet is connected successfully");
//}
}
