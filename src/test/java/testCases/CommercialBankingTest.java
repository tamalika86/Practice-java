package testCases;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.CommercialBanking;
import pageObjects.HomePage;
import utilities.Util;

//@Listeners({MethodListener.class})
public class CommercialBankingTest extends InIt{
	HomePage hp;
   CommercialBanking cb;
    @Test
    public void checkCommercialBankingLink() throws Exception{
        hp = new HomePage(driver);
        cb = new CommercialBanking(driver);
        hp.clickCommercialBanking();
        Util.takeScreenShots(driver, methodName);
        Assert.assertEquals(cb.getCommercialLendingHeading(),"COMMERCIAL BANKING");
    }

    @Test
    public void checkCommercialBankingDeatilPage() throws Exception{
        hp = new HomePage(driver);
        cb = new CommercialBanking(driver);
        hp.clickCommercialBanking();
        cb.clickCommercialBankingHeading();
        Util.takeScreenShots(driver, methodName);
        Assert.assertEquals(cb.getCommercialBankingUrl(),"https://www.websterbank.com/commercial-banking/");
    }

   // @Test
}
