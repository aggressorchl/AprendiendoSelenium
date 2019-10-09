package test;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.junit.Test;
import util.configs.BaseConfig;

public class HomePage extends BaseConfig {

    private WebElement pageTitle;
    private WebElement entryContent;
    private WebElement commentLinks;
    private WebElement searchBar;
    private WebElement widgetTitle;
    private WebElement widgetLinkText;

    @Test
    public void testHomePage() {

        //Catching web elements
        setPageTitle(getWebDriver().findElement(By.className("site-title")));
        setEntryContent(getWebDriver().findElement(By.className("entry-content")));
        setCommentLinks(getWebDriver().findElement(By.xpath("//span[@class=\"comments-link\"]//a")));
        setSearchBar(getWebDriver().findElement(By.className("search-field")));
        setWidgetTitle(getWebDriver().findElement(By.className("widget-title")));
        setWidgetLinkText(getWebDriver().findElement(By.linkText("¡Hola mundo!")));

        //Assertions
        Assert.assertEquals("Automation Test Page",pageTitle.getText());
        Assert.assertEquals("Bienvenido(a) a WordPress. Esta es tu primera entrada. Edítala o bórrala ¡y comienza a publicar!",entryContent.getText());
        Assert.assertEquals("1 Comentario\n" + "en ¡Hola mundo!", getCommentLinks().getText());

        searchBar.sendKeys("UWU");

        Assert.assertEquals("Entradas recientes",widgetTitle.getText());
        Assert.assertEquals("¡Hola mundo!",widgetLinkText.getText());
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(WebElement pageTitle) {
        this.pageTitle = pageTitle;
    }

    public WebElement getEntryContent() {
        return entryContent;
    }

    public void setEntryContent(WebElement entryContent) {
        this.entryContent = entryContent;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(WebElement searchBar) {
        this.searchBar = searchBar;
    }

    public WebElement getWidgetTitle() {
        return widgetTitle;
    }

    public void setWidgetTitle(WebElement widgetTitle) {
        this.widgetTitle = widgetTitle;
    }

    public WebElement getWidgetLinkText() {
        return widgetLinkText;
    }

    public void setWidgetLinkText(WebElement widgetLinkText) {
        this.widgetLinkText = widgetLinkText;
    }

    public WebElement getCommentLinks() {
        return commentLinks;
    }

    public void setCommentLinks(WebElement commentLinks) {
        this.commentLinks = commentLinks;
    }
}