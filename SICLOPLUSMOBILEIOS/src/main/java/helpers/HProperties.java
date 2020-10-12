package helpers;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
* 
* @author Abraham Galindo
* @description Esta clase contiene metodos de ayuda para la lectura del archivo properties de configuracion.
* @date 08/10/2020
*
*/

public class HProperties {
	
	public static String strAppiumServer;
	public static String strUser;
	public static String strPsw;
	
	public static String readPath() {
		return new File("").getAbsolutePath();
	}
	
	public static void readProperties() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(readPath() + "\\Properties\\Config.properties"));	
			
			strAppiumServer = properties.getProperty("appiumServer");	
			
		}catch(IOException e) {
			System.out.println("Error, no se puede leer el archivo properties");
		}
	}
	 

}
