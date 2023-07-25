package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommercialBanking extends BasePage{
	
	WebDriver driver;
	public CommercialBanking(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(linkText="https://www.websterbank.com/commercial-banking/lending/")
	WebElement commercialLending;
	
	@FindBy(xpath = "xpath=//a[contains(text(),'Commercial Savings')]")
	WebElement commercialBankingHeading;
	
	//Action
	public void clickCommercialLendingLink() {
		commercialLending.click();
	}
	public String getCommercialLendingHeading() {
		try {
			return commercialBankingHeading.getText();
		}
		catch (Exception e){
			return(e.getMessage());
		}
	}
	
}
