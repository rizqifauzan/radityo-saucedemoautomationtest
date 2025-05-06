package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static helper.Utility.webDriver;

public class LoginPage {

    By inputUsername = By.id("user-name");
    By inputPassword = By.id("password");
    By buttonLogin = By.id("login-button");
    By errorMessagewrongpassword = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3");


    public void setInputUsername(String username){
        webDriver.findElement(inputUsername).clear();
        webDriver.findElement(inputUsername).sendKeys(username);
    }

    public void setInputPassword(String password){
        webDriver.findElement(inputPassword).clear();
        webDriver.findElement(inputPassword).sendKeys(password);
        webDriver.findElement(buttonLogin).click();
    }

    public void setInputWrongPassword(String wrongpass){
        webDriver.findElement(inputPassword).sendKeys(wrongpass);
        webDriver.findElement(buttonLogin).click();
    }
    public boolean isPageIsDisplayed(){
        webDriver.findElement(inputUsername).isDisplayed();
        webDriver.findElement(inputPassword).isDisplayed();
        webDriver.findElement(buttonLogin).isDisplayed();
        return true;
    }

    public boolean isErrorMessageDisplayedinLogin(){
        webDriver.findElement(inputUsername).isDisplayed();
        webDriver.findElement(inputPassword).isDisplayed();
        webDriver.findElement(buttonLogin).isDisplayed();
        webDriver.findElement(errorMessagewrongpassword).isDisplayed();
        String errorMessage = webDriver.findElement(errorMessagewrongpassword).getText();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",errorMessage);

        return true;
    }
}
