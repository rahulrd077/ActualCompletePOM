package testBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Properties prop ;
	
	public static WebDriver driver ;
	
	public Base() {
		
	 prop = new Properties();
		try {
		FileInputStream file = new FileInputStream ("D:\\Workspace\\PageObjectModel\\src\\main\\java\\propertiesfiles\\objectrepository.properties") ;
		
		prop.load(file);
	}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
		public void InitializeTestBase() {
			
			String BrowserName = prop.getProperty("BROWSER");
			
			if(BrowserName.contains("chrome")) {
				
				System.setProperty("webdriver.chrome.driver" , "D:\\chromedriver version 78\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			
			driver.get(prop.getProperty("URL"));
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		
		}

}
