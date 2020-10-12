package test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.io.IOException;
import org.junit.Before;
import org.junit.Assert;
import org.junit.After;
import org.junit.Test;
import java.net.URL;
import modules.*;

/**
 * 
 * @author Abraham Galindo
 * @description Esta clase contiene metodos que hacen llamado a los modulos para completar los pasos de los TC
 * @date 08/10/2020
 *
 */

public class SCL_000001 extends BaseTest {
	@Test
	public void login() throws IOException {
		try {
			int step = 0;
			System.out.println("Step:" + step + "... Iniciando la aplicaciòn");
			//driver.get("http://google.com");
		    //Assert.assertEquals("Title should be Google", "Google", driver.getTitle());
			
			
		}catch(Exception e){
			System.out.println("Fallo el script");
		}
		
	}
}
