package util.configs;

import org.openqa.selenium.WebDriver;

public class BaseConfig {

    private DriverFactoryFinal driverProperty = new DriverFactoryFinal();
    private WebDriver webDriver = getDriverProperty().getWebDriver();


    public DriverFactoryFinal getDriverProperty() {
        return driverProperty;
    }

    public void setDriverProperty(DriverFactoryFinal driverProperty) {
        this.driverProperty = driverProperty;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
