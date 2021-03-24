package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (id = "name")
    WebElement t_username;

    @FindBy (id = "password")
    WebElement t_password;

    @FindBy (id = "login")
    WebElement b_login;


    public void enterUsername(String username){
        t_username.sendKeys(username);
    }
    public  void enterPassword (String password){
        t_password.sendKeys(password);
    }
    public void clickOnLogin(){
        b_login.click();
    }



}
