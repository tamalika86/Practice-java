package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
	}

	
	//Elements
	@FindBy(xpath = "//span[contains(.,'Personal')]")
	WebElement personalBanking;
	@FindBy(linkText = "Personal Checking")
	WebElement commercialBanking;
	@FindBy(xpath="//a[@class='siteheader-logo']/img")
	WebElement logo;
	//Action
	public void clickPersonalBanking() {
		personalBanking.click();
	}
	
	public void clickCommercialBanking() {
		commercialBanking.click();
	}
	public String getLogoText(){
		return logo.getText();
	}
}
