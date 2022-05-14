package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import toolbox.Driver;

// Page Object Model for Google Search Page
public class Google {

    // Constructor to initialize the elements of the page object model (PO) using PageFactory class and the driver instance from Driver class (Singleton)
    public Google() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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

