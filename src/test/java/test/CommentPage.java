package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.configs.BaseConfig;

public class CommentPage extends BaseConfig {

    @Test
    public void CommentPage(){

        HomePage homePage = new HomePage();


        //Catching web elements
        WebElement pageTitle = getWebDriver().findElement(By.className("site-title"));
    }

}
