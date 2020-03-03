package allTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.Homepage;

public class BaseTest {
	private static BaseTest instance;
	WebDriver driver;
	Homepage homepage;
	
	private BaseTest() {		
	}
	
	public WebDriver getDriver(String driverValue) {
		if (driver == null) {
			if (driverValue.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\hoque\\eclipse-workspace\\TargetAutomation\\Browser\\chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (driverValue.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\hoque\\eclipse-workspace\\TargetAutomation\\Browser\\geckodriver.exe");
				driver = new FirefoxDriver();	
		}		
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	 public static BaseTest getInstance() {
		 if (instance == null) { 
			instance = new BaseTest();
		 } return instance;
		
	 }
	 public Homepage getHomepage() {
		 if (homepage == null) {
			homepage = new Homepage(driver);
		}
		return homepage;
	}
	 
	 
	 
	 
	
	

}
