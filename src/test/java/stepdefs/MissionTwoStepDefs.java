/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import pages.IMDbFilmoSearchPage;
import pages.IMDbStarPage;
import toolbox.Driver;

// This class is the Step Definitions class for the Mission Two scenario in the TheHerakles.feature file.
public class MissionTwoStepDefs {
    // The Google page object.
    GooglePage google = new GooglePage();
    // The IMDb Star page object.
    IMDbStarPage imdb = new IMDbStarPage();
    // The IMDb Filmography Search page object.
    IMDbFilmoSearchPage filmo = new IMDbFilmoSearchPage();

    @Given("navigate to search engine")
    public void navigate_to_search_engine() {
        // navigate to google
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("enter search bar for actor name {string}")
    public void enter_search_bar_for_actor_name(String searchStr) {
        // enter search string
        google.searchBox.sendKeys(searchStr);
        // press enter
        google.searchButton.sendKeys(Keys.ENTER);
    }

    @Then("select {string} from search results")
    public void select_from_search_results(String str) {
        // select the first search result
        google.selectSearchResult(str);
    }

    @Then("verify that title is {string}")
    public void verify_that_title_is(String expectedTitle) {
        // verify the title is correct or not by comparing the expected and actual title
        Assert.assertEquals(expectedTitle, imdb.getActualTitle());
    }

    @Then("select Show by... from drop down menu")
    public void select_Show_by_from_drop_down_menu() {
        // click on the Show by... option
        imdb.clickDropdown();
    }

    @Then("select {string} from drop down menu")
    public void select_from_drop_down_menu(String str) {
        // select the expected keyword
        imdb.selectDropdownOption(str);
    }

    @Then("click on the Keywords vertical tab from the refine section")
    public void click_on_the_vertical_tab_from_the_refine_section() {
        // Assert the right page is loaded
        Assert.assertTrue(imdb.getActualTitle().contains("Bruce Willis"));
        filmo.keywords.click();
    }

    @Then("verify the keywords are not sorted by name")
    public void verify_the_keywords_are_not_sorted_by_name() {
        Assert.assertFalse(filmo.isKeywordsSortedByName());
    }

    @Then ("verify that {string} is not a word in the keyword list")
    public void verify_that_is_not_a_word_in_the_keyword_list(String str) {
        Assert.assertFalse(filmo.isKeywordInList(str));
    }



}

