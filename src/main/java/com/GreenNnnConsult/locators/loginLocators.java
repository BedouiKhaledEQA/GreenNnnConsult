package com.GreenNnnConsult.locators;

import com.GreenNnnConsult.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginLocators extends Base {
    public loginLocators(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//input[@name='email']" )
    protected
    WebElement email;
    @FindBy(xpath ="//input[@name='clave']" )
    protected
    WebElement password;
    @FindBy(xpath ="//button[@type='submit']" )
    protected
    WebElement loginButton;
    @FindBy(xpath ="//div[@id='logocliente']" )
    protected
    WebElement loginAssert;
    @FindBy(xpath ="//button[@id='onetrust-accept-btn-handler']")
    protected
    WebElement cookiesAccept;

}
