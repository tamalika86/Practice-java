package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CommercialBanking extends BasePage{

	public 	CommercialBanking(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver,this);
	}
	
	
	//Elements
	@FindBy(linkText="https://www.websterbank.com/commercial-banking/lending/")
	WebElement commercialLending;
	@FindBy(xpath = "//div[@class='submenu-heading']//a[contains(text(),'Commercial Banking')]")
	WebElement commercialBankingHeading;
	@FindBy(xpath = "//a[contains(text(),'Commercial Banking')]")
	WebElement commercialBankingHeading2;
	
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
	 public void clickCommercialBankingHeading(){
		commercialBankingHeading2.click();
	 }
	 public String getCommercialBankingUrl(){
		return driver.getCurrentUrl();
	 }
	
}
