/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

package pages;

import org.openqa.selenium.support.PageFactory;
import toolbox.Driver;

public abstract class GroundPage {
    // Constructor to initialize the elements of the page object model (PO) using PageFactory class and the driver instance from Driver class (Singleton)
    public GroundPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
