package pages;

/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import toolbox.Driver;

// Page Object Model for Google Search Page
public class GooglePage extends GroundPage {

    // Page Elements
    @FindBy(xpath = "//input[@name='q']") // xpath for the search box in Google Search Page
    public WebElement searchBox;

    @FindBy(xpath = "//input[@name='btnK']")
    public WebElement searchButton; // xpath for search button on Google Search Page

    // select for the search result with the given string
    public void selectSearchResult(String str) {
        Driver.getDriver().findElement(By.xpath("//h3[contains(text(), '" + str + "')]")).click();
    }
}

