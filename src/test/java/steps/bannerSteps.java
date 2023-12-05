package steps;

import com.GreenNnnConsult.Base;
import com.GreenNnnConsult.Pages.bannerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bannerSteps extends Base {
    bannerPage BannerPage;
    @Then("Banner should be displayed")
    public void banner_should_be_displayed() {
        BannerPage =new bannerPage();
        BannerPage.BannerAssertion();

    }
    @Then("Text Banner should be the same")
    public void text_banner_should_be_the_same() {
        BannerPage=new bannerPage();
        BannerPage.textBannerAssertion();
    }

    @When("User click on the redirection button on the banner")
    public void user_click_on_the_redirection_button_on_the_banner() throws InterruptedException {
        BannerPage=new bannerPage();
        BannerPage.performAquiButton();

    }
    @Then("redirection should be displayed in new tab")
    public void redirection_should_be_displayed_in_new_tab() {
        BannerPage.newTabAssertion();

    }


}
