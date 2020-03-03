package allPages;

import org.openqa.selenium.WebDriver;

public class Homepage extends Generic {
	String search = "//input[@id = 'search']";
	String searchResult ="//span[text()='computer']";
	String tx= "//span[@class='h-text-lg']";

	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	public void url() {
		getUrl("https://www.target.com/");
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void searching() {
		typeOnElement(search, "computer");	
	}
	
	public String searchResult() {
		return getText(searchResult);
	}
	
	// for validating computer 
	public String gText() {
		return getText(tx);
		
	}
	
	

}
