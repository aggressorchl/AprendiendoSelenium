package test;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.junit.Test;
import util.configs.BaseConfig;

public class HomePage extends BaseConfig {

    @Test
    public void testHomePage() {

        //Catching web elements
        WebElement pageTitle = getWebDriver().findElement(By.className("site-title"));
        WebElement entryContent = getWebDriver().findElement(By.className("entry-content"));
        WebElement searchBar = getWebDriver().findElement(By.className("search-field"));

        //Assertions
        Assert.assertEquals("Automation Test Page",pageTitle.getText());
        Assert.assertEquals("Bienvenido(a) a WordPress. Esta es tu primera entrada. Edítala o bórrala ¡y comienza a publicar!",entryContent.getText());

        searchBar.sendKeys("UWU");
        searchBar.clear();
        searchBar.sendKeys("ewe");
    }
}