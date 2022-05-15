package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import toolbox.Driver;

import java.util.List;

public class IMDbFilmoSearchPage extends IMDbStarPage{
    // Web Element for keywords search input refine section
    @FindBy(xpath = "//*[@data-for='keywords']/strong")
    public WebElement keywords;

    @FindBy(xpath = "//fieldset[@name='keywords']/label/span[@class='faceter-facet-text']")
    public List<WebElement> keywordsInput;

    // Check first character of keyword first input and compare it with ascii value and retyrn boolean value
    public boolean isKeywordsSortedByName(){
        boolean sorted = false; // default value
        // get keyword string first character and compare with next character
        if (keywordsInput.get(0).getText().charAt(0) > 65 || keywordsInput.get(0).getText().charAt(0) > 97) {
            sorted = false;
        }
        return sorted;
    }


    public boolean isKeywordInList(String keyword){
        boolean found = false;
        for (WebElement element : keywordsInput){
            if (element.getText().equals(keyword)){
                found = true;
            }
        }
        return found;
    }
}
