package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

import static helper.Utility.webDriver;

public class LoginStepDef {

    @Given("user on the login page")
    public void onTheLoginPage(){
            LoginPage loginPage = new LoginPage();
            Assert.assertTrue(loginPage.isPageIsDisplayed());
    }

    @When("user input {string} as username")
        public void inputUsername(String username) {
        LoginPage loginPage = new LoginPage();
        loginPage.setInputUsername(username);
        }

    @When("user input {string} as password")
    public void inputPassword(String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.setInputPassword(password);
    }

    @Then("user will be redirected to home page")
    public void verifyHomepage(){
        HomePage homepage = new HomePage();
        Assert.assertTrue(homepage.verifyPageIsDisplayed());
    }

    @When("user input {string} as invalid password")
    public void userInputAsInvalidpassword(String wrongpass) {
        LoginPage loginPage = new LoginPage();
        loginPage.setInputPassword(wrongpass);
    }

    @Then("user will be redirected to login page with error message")
    public void userWillBeRedirectedToLoginPage() {
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isErrorMessageDisplayedinLogin());

    }
}


