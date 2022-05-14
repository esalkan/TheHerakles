package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import toolbox.Driver;

public class IMDbStarPage {
    // Constructor to initialize the elements of the page object model (PO) using PageFactory class and the driver instance from Driver class (Singleton)
    public IMDbStarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getActualTitle() {
        return Driver.getDriver().getTitle();
    }
}
