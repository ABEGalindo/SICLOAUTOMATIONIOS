package test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import helpers.HProperties;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import org.junit.Before;
import org.junit.Assert;
import org.junit.After;
import org.junit.Test;
import java.net.URL;

/**
 * 
 * @author Abraham Galindo
 * @description Esta clase contiene metodos iniciales para la ejecucion de los scripts
 * @date 08/10/2020
 *
 */

public class BaseTest {
	public static RemoteWebDriver driver;
	
	@Before
    public void setUp() throws MalformedURLException {
      /*  String device = System.getenv("device");

        if(device != null && device.equalsIgnoreCase("Android")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","Android Emulator");
            capabilities.setCapability("platformVersion", "4.4");
            capabilities.setCapability("app", "Browser");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } else {*/
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "iPhone X");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "14.0");
            //capabilities.setCapability("browserName", "safari");
            capabilities.setCapability("app", /*HProperties.readPath() + */"/Users/abraham/Downloads/Siclo.app");
            
            this.driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //}
    }
	
	 @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	

}
