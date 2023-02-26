package javatopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbpage {
WebDriver driver;
//    By email=By.name("email");
//    By pwd=By.name("pass");
//    By login=By.name("login");

    public fbpage(WebDriver driver){
        this.driver=driver;

        PageFactory.initElements(driver,this);
    }
    @FindBy(name="email")
    WebElement email;
    @FindBy(name="email")
    WebElement pwd;
    @FindBy(name="email")
    WebElement login;

    public void getcred(String emailid,String pass){

        email.sendKeys(emailid);
       pwd.sendKeys(pass);
    }

    public void clciklog(){
       login.click();

    }
}
