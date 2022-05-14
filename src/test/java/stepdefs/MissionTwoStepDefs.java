package stepdefs;

/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

import io.cucumber.java.en.Given; // import the Given annotation
import io.cucumber.java.en.Then; // import the Then annotation
import io.cucumber.java.en.When; // import the When annotation
import org.junit.Assert;
import pages.Google;
import pages.IMDbStarPage;
import toolbox.Driver;

// This class is the Step Definitions class for the Mission Two scenario in the TheHerakles.feature file.
public class MissionTwoStepDefs {
    Google google = new Google();
    IMDbStarPage imdb = new IMDbStarPage();

    @Given("navigate to search engine")
    public void navigate_to_search_engine() {
        // navigate to google
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("enter search bar for actor name {string}")
    public void enter_search_bar_for_actor_name(String searchStr) {
        // enter search string
        google.searchBox.sendKeys(searchStr);
    }

    @Then("enter keys on keyboard")
    public void enter_keys_on_keyboard() {
        // click on search button
        google.searchButton.click();
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
}

