package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomePageTest extends InIt{
	
	HomePage hp = new HomePage(driver);
	
	@Test
	public void verifyLogo() {
		String logo = hp.getLogoText();

	}

}
