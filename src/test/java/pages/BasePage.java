package pages;

import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
