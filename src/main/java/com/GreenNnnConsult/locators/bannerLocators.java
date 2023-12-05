package com.GreenNnnConsult.locators;

import com.GreenNnnConsult.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bannerLocators extends Base {
    public bannerLocators(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='text-banner-migration']")
    protected
    WebElement bannerDisplayed;
    @FindBy(xpath = "//div[@class='txt-banner']")
    protected
    WebElement textBanner;
    @FindBy(xpath = "//body[1]/div[6]/div[1]/div[1]/a[1]")
    protected
    WebElement aquiButton;
}
