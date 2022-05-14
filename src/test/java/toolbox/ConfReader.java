package toolbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

public class ConfReader {

    // Properties object to hold the properties file data in memory for easy access
    private static Properties properties;

    // Path to the properties file
    static {
        try {
            // Path to the properties file
            String path = "config.properties";
            // FileInputStream object to read the properties file
            FileInputStream input = new FileInputStream(path);
            // Properties object to hold the properties file data in memory for easy access
            properties = new Properties();
            // Load the properties file
            properties.load(input);
            // Close the file
            input.close();
        } catch (IOException e) { // Catch any IO exceptions
            e.printStackTrace(); // Print the stack trace
        }
    }

    // Get the value of a property from the properties file
    public static String getConf(String keyName) {
        return properties.getProperty(keyName);
    }
}
