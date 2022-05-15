/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

package toolbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Driver {
    // Constructor for driver.
    private Driver() {
    }

    // for reaching to the WebDriver from everywhere. It's a singleton.  It's a static variable.
    private static WebDriver driver;

    // Instance getDriver(browserType) method for driver. It's a static method.
    public static WebDriver getDriver() {
        // Adding condition before driver type selection to avoid null pointer exception.
        if (driver == null) {
            String browserType = ConfReader.getConf("browser");
            // Based on browser selection setup browser driver type. It's a switch case.
            switch (browserType) {
                // Chrome browser WebDriver setup for Chrome browser.
                case "chrome":
                    WebDriverManager.chromedriver().setup(); // Chrome driver setup.
                    driver = new ChromeDriver(); // Chrome driver initialization.
                    break;
                // Firefox browser WebDriver setup
                case "firefox":
                    WebDriverManager.firefoxdriver().setup(); // Firefox driver setup.
                    driver = new FirefoxDriver(); // Firefox driver initialization.
                    break;
                // Internet Explorer browser WebDriver setup
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) { // If OS is not Windows.
                        throw new WebDriverException("Your OS doesn't support Internet Explorer"); // Throw exception.
                    }
                    WebDriverManager.iedriver().setup(); // Internet Explorer driver setup.
                    driver = new InternetExplorerDriver(); // Internet Explorer driver initialization.
                    break;
                // Edge browser WebDriver setup
                case "edge":
                    // Checking system os type and throw exception with message if the browser type is not match with system.
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) { // If OS is not Windows.
                        throw new WebDriverException("Your OS doesn't support Edge"); // Throw exception.
                    }
                    WebDriverManager.edgedriver().setup(); // Edge driver setup.
                    driver = new EdgeDriver(); // Edge driver initialization.
                    break;
                // Safari browser WebDriver setup
                case "safari":
                    // Checking system os type and throw exception with message if the browser type is not match with system.
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) { // If OS is not Mac.
                        throw new WebDriverException("Your OS doesn't support Safari"); // Throw exception.
                    }
                    WebDriverManager.getInstance(SafariDriver.class).setup(); // Safari driver setup.
                    driver = new SafariDriver(); // Safari driver initialization.
                    break;
            }
        }
        return driver; // Return driver.
    }

    // Instance killDriver() method for driver.
    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
