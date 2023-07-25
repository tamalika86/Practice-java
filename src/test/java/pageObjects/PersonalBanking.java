package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalBanking extends BasePage {
	WebDriver driver;
	public PersonalBanking(WebDriver driver){
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//ul[@id='menu-personal-banking-menu']//a[contains(text(),'Personal Checking')]") 
	WebElement PersonalCheckin;
	@FindBy(xpath = "//div[@class='submenu-heading']//a[contains(text(),'Personal Banking')]") 
	WebElement PersonalBankingHeading;
	
	//Action
	
	public void clickPersonalChecking() {
		PersonalCheckin.click();
	}
	
	public String getPersonalBankingHeading() {
		return PersonalBankingHeading.getText();
	}
	

}
