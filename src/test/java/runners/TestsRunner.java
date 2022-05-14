package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

// Declaring features files where are they placed
@RunWith(Cucumber.class)
// CucumberOptions to run the test
@CucumberOptions(
        plugin = {
                "pretty",                               // Prints the output in a readable format
                "json:target/cucumber.json",            // Creating a json report
                "html:target/default-html-report",      // Creating a 'Default html' report
                "rerun:target/rerun.txt"                // Saving in to the file failed scenario line in feature
        },
        features = "src/test/resources/features",       // *.feature files path
        glue = "stepdefs",                              // step definitions path
        dryRun = false,                                 // check step definitions
        tags = "@wip"                                   // *.feature file tag which want to execute
)
public class TestsRunner {

}
