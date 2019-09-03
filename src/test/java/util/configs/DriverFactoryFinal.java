package util.configs;

import entities.DriversEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactoryFinal {

    static WebDriver webDriver;

    static String driver = DriversEnum.CHROME.getNombre();
    static String ruta = DriversEnum.CHROME.getRuta();
    static String url = "http://localhost/wordpress";

    public DriverFactoryFinal(){
        System.setProperty(driver, ruta);
        setWebDriver(new ChromeDriver());
        getWebDriver().get(url);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}

