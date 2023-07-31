package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import javax.swing.text.html.HTML;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver){
		super(driver);
	}

	//Elements
	@FindBy(xpath = "//span[contains(.,'Personal')]/parent::li")
	WebElement personalBanking;
	@FindBy(xpath = "//span[contains(.,'Commercial')]/parent::li")
	WebElement commercialBanking;
	@FindBy(xpath="//a[@class='siteheader-logo']/img")
	WebElement logo;

	@FindBys({
			@FindBy(tagName="a")
	})
	//@FindBys(tagName = "allLinks")
	List <WebElement> allLinks;
	//List<WebElement> allLink = driver.findElements(By.TagName("a"));
	//Action
	public void clickPersonalBanking() {
		personalBanking.click();
	}
	public void clickCommercialBanking() {
		commercialBanking.click();
	}
	public Boolean getLogoText(){
		Boolean x = logo.isDisplayed();
		return x;
	}
	 public HashMap verifyLinks(){
		 HashMap myMap = new HashMap();
		//System.out.println("------"+allLinks.size());
		for (WebElement link: allLinks){
			String targetLink = link.getAttribute("href");
			//System.out.println(targetLink);
			if(targetLink==null || targetLink.isEmpty())
				continue;
			else{
				try{
					URL url = new URL(targetLink);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.connect();
					if(conn.getResponseCode()>=400) {
						//System.out.println("Broken:" + targetLink);
						myMap.put(targetLink,"Broken");
					}
					else {
						//System.out.println("Pass: " + targetLink);
						myMap.put(targetLink, "Broken");
					}
				}
				catch(Exception ex){
				}

			}
		}
		return myMap;
	 }
}
