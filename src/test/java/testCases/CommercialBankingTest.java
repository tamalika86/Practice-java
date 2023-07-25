package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CommercialBanking;
import pageObjects.HomePage;

public class CommercialBankingTest extends InIt{

WebDriver wb = super.driver;


    @FindBy(xpath = "xpath=//a[contains(text(),'Commercial Savings')]")
    WebElement commercialBanking;

	HomePage hp = new HomePage(driver);
   // CommercialBanking cb = new CommercialBanking(driver);
    @Test
    public void checkCommercialBankingLink(){
      System.out.println();
         //commercialBanking.click();
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("xpath=//a[contains(text(),'Commercial Savings')]")).click();

           // commercialBanking.click();
            Thread.sleep(5000);
        }catch (Exception e){}
        hp.clickCommercialBanking();
    }

   // @Test
   /* public void verifyCommercialBankingHeading(){
        try {
            cb.clickCommercialLendingLink();
            Assert.assertEquals(cb.getCommercialLendingHeading(),"COMMERCIAL BANKING");
        }
        catch (Exception e){

        }*/
   // }
}
