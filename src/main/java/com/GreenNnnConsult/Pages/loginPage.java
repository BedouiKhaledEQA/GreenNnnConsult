package com.GreenNnnConsult.Pages;

import com.GreenNnnConsult.Base;
import com.GreenNnnConsult.locators.loginLocators;
import org.junit.Assert;

public class loginPage extends loginLocators {
    public void loginPerform() throws InterruptedException {
        cookiesAccept.click();
        Thread.sleep(3000);
        email.sendKeys(Base.props.getProperty("mail"));
        password.sendKeys(Base.props.getProperty("pass"));
        loginButton.click();
    }


    public void loginPerformOutLine(String mail, String pass) throws InterruptedException {
        cookiesAccept.click();
        Thread.sleep(3000);
        email.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
    }
    public void loginAssertion(){
       Assert.assertTrue((loginAssert).isDisplayed());
    }
    public void loginAssertionFalse(){
        System.out.println("Error,False Credential");
    }
}
