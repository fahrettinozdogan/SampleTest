package steps;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utilies.ConfigurationReader;
import utilies.Driver;

public class LoginSteps {

    LoginPage login =  new LoginPage();


    @Given("User is on login page")
    public void userIsOnLoginPage() {
    String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @When("^User enters (.*) and (.*)")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {

      login.enterUsername(username);
      Thread.sleep(2000);
      login.enterPassword(password);
        Thread.sleep(2000);
    }
    @And("User clicks on login button")
    public void userClicksOnLoginButton() throws InterruptedException {
    login.clickOnLogin();
        Thread.sleep(2000);

    }
    @Then("User is navigated to the homepage")
    public void userIsNavigatedToTheHomepage() throws InterruptedException {
     HomePage home = new HomePage();
     home.checkLogoutIsDisplayed();
        Thread.sleep(2000);




    }

}
