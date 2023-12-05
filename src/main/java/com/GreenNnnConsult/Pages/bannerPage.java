package com.GreenNnnConsult.Pages;

import com.GreenNnnConsult.locators.bannerLocators;
import org.junit.Assert;

import java.util.Set;

public class bannerPage extends bannerLocators {
    public void BannerAssertion(){
        Assert.assertTrue((bannerDisplayed).isDisplayed());
    }
    public void textBannerAssertion(){
        String text =textBanner.getText();
        Assert.assertEquals("Para una mejor experiencia de usuario, la consulta por taxonomías NNN ahora también está disponible en la plataforma ClinicalKey Student Enfermería. Para probarla, acceda aquí y haga su registro.",text);
    }

    public void performAquiButton() throws InterruptedException {
        aquiButton.click();
        Thread.sleep(6000);
    }
    public void newTabAssertion(){
        String ongletOrigine = driver.getWindowHandle();
        // Obtenez tous les identifiants de fenêtre actuels (onglets)
        Set<String> tousLesOnglets = driver.getWindowHandles();
        // Parcourez les onglets pour trouver celui qui n'est pas l'onglet d'origine
        for (String onglet : tousLesOnglets) {
            if (!onglet.equals(ongletOrigine)) {
                // Commutez vers le nouvel onglet
                driver.switchTo().window(onglet);
                // Récupérez l'URL du nouvel onglet
                String urlNouvelOnglet = driver.getCurrentUrl();
                System.out.println("URL du nouvel onglet : " + urlNouvelOnglet);
                // Revenez à l'onglet d'origine
                //driver.switchTo().window(ongletOrigine);
            }
        }

    }
}
