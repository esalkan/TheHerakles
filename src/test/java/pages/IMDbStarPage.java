/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import toolbox.Driver;

public class IMDbStarPage extends GroundPage{

    // Web Element for Filmography dropdown
    @FindBy(xpath ="//*[@name='sort']")
    public WebElement sortBy;

    // getting the actual title of the page
    public String getActualTitle() {
        return Driver.getDriver().getTitle();
    }

    // Clicking on the Dropdown option
    public void clickDropdown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        sortBy.click();
    }

    // Selecting the option from the dropdown
    public void selectDropdownOption(String option){
        Select stateOption = new Select(sortBy);
        stateOption.selectByVisibleText(option);
    }
}

