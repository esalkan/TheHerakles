package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import toolbox.Driver;

import java.time.Duration;

/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

// This class is used to define the hooks for the project
public class Hooks {

    // Before hook for the project
    @Before
    // This method will be executed before every scenario in the project
    public void startUp(){
        // Maximize the browser window before every scenario starts running in the project
        Driver.getDriver("chrome").manage().window().maximize();
        // Set implicit wait for the project to wait for the element to be visible in the project
        Driver.getDriver("chrome").manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    // After hook for the project
    @After
    // This method will be executed after every scenario in the project is finished
    public void tearDown() {
        // Screenshot feature can be added but i did not add that feature for that task

        // Close the browser window after every scenario is finished in the project
        Driver.killDriver();
    }
}
