package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import utilities.Util;

public class HomePageTest extends InIt{
	HomePage hp;
	public HomePageTest(){
		super();
		hp = new HomePage(driver);
	}
	@Test
	public void verifyLogo() throws  Exception{
		hp = new HomePage(driver);
		Assert.assertEquals(hp.getLogoText(),true);
		Util.takeScreenShots(driver, methodName);
	}

	@Test
	public void verifyLogo2() throws  Exception{
		hp.clickCommercialBanking();
		Thread.sleep(4000);
		Util.takeScreenShots(driver, methodName);
	}
}
