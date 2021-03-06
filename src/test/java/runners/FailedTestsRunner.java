/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // This annotation is used to run the test
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},    // Report target path
        features = {"@target/rerun.txt"},               // rerun file path
        glue = {"src/test/java/stepdefs"}               // step definitions path
)
public class FailedTestsRunner {
}
