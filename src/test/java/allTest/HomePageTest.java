package allTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;


public class HomePageTest {

	BaseTest instance = BaseTest.getInstance();
	
	@Test
	public void titaleValidation() {
		instance.getDriver("chrome");
		instance.getHomepage().url();
	String title = instance.getHomepage().getTitle();
	System.out.println(title);

	// HardAssart
		Assert.assertEquals(title,"Target : Expect More. Pay Less.");
		System.out.println("Test for hard assert");
		
	
	// For SOFTASSART test
	
//	SoftAssert sa= new SoftAssert();
//	 sa.assertEquals(title,"Target : xpect More. Pay Less." );
//	 sa.assertAll();
//	 System.out.println("Test for soft assert");	
	}
	
	// by me for the computer text validation---ZEA
	@Test
	public void textValidation() {
		instance.getDriver("chrome");
		instance.getHomepage().url();
		instance.getHomepage().searching();
		String elementText=instance.getHomepage().searchResult();
		System.out.println(elementText);
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		instance.driver.close();
	}
	
}
