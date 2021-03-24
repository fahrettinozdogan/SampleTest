package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "logout")
    WebElement b_logout;

    public  void checkLogoutIsDisplayed(){
        b_logout.isDisplayed();
    }
}

