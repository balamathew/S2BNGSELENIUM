package PlayWright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.openqa.selenium.JavascriptExecutor;

public class FirstRun {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        BrowserContext browserContext= browser.newContext(new Browser.NewContextOptions().setViewportSize(1200,1000));
        //        Browser browser=playwright.chromium().launch(lp);
        Page page = browserContext.newPage();
        page.navigate("https://books-pwakit.appspot.com/");
        page.pause();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Favorites"));
        page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Fav"));
        //page.selectOption("select#Form_getForm_Country","Afghanistan");
        //page.locator("select#Form_getForm_Country").selectOption("Afghanistan");
//just a human
//        Locator countrylist=page.locator("select#Form_getForm_Country option");
//        countrylist.selectOption("Afghanistan");
        //page.locator("div a:has-text('Register')").click();
        System.out.println(page.locator("book-viewer[class='_page']").textContent());


       //frame
        //page.frame("name of the frame");

//for (int j=0;j<i;j++){
//    if (countrylist.nth(j).textContent().startsWith("B")){
//        System.out.println(countrylist.nth(j).textContent());
//
//    }
//}


        browser.close();
        playwright.close();

    }

}
