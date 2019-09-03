package test;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.junit.Test;
import util.configs.BaseConfig;

public class HomePage extends BaseConfig {

    @Test
    public void testHomePage() throws InterruptedException {

        //Catching web elements
        WebElement pageTitle = getWebDriver().findElement(By.className("site-title"));

        //Assertions
        Assert.assertEquals("Automation Test Page",pageTitle.getText());
    }
}