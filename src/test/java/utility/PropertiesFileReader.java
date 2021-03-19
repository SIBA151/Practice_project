package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	public static String getconfigProperty(String propname) {
		FileInputStream fis=null;
		String filepath=System.getProperty("user.dir")+"//config//config.properties";
		try {
			fis=new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop=new Properties();
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String propVal=prop.getProperty(propname);
		return propVal;
		
		
	}
	public static void main(String[] args) {
  	  String browser=getconfigProperty("browser");
  	  System.out.println("Browser value -"+browser);
  	  
  	  String appUrl=getconfigProperty("appUrl");
  	  System.out.println("username value -"+appUrl);
  	  
    }


}
