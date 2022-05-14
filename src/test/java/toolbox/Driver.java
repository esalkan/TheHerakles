package toolbox;

/**
 * @author esalkan
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Driver {
    // Constructor
    private Driver() {
    }

    // for reaching to the WebDriver from everywhere.
    private static WebDriver driver;

    // Instance getDriver(browserType) method for driver.
    public static WebDriver getDriver(String browserType) {
        // Adding condition before driver type selection
        if (driver == null) {
            // Based on browser selection setup browser driver type.
            switch (browserType) {
                // Chrome browser WebDriver setup
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                // Firefox browser WebDriver setup
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                // Internet Explorer browser WebDriver setup
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    }
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                // Edge browser WebDriver setup
                case "edge":
                    // Checking system os type and throw exception with message if the browser type is not match with system.
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support Edge");
                    }
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                // Safari browser WebDriver setup
                case "safari":
                    // Checking system os type and throw exception with message if the browser type is not match with system.
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your OS doesn't support Safari");
                    }
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        return driver;
    }

    // After test step definitions killing the driver and make web driver null
    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
