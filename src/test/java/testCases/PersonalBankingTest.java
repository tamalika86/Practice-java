package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PersonalBanking;

public class PersonalBankingTest extends InIt{

    HomePage hp;
    PersonalBanking pb;

    @Test
    public void verifyPersonalBanking(){
        hp.clickPersonalBanking();
    }

    @Test
    public void VerifyHeading(){
        hp= new HomePage(driver);
        pb = new PersonalBanking(driver);
        hp.clickPersonalBanking();
        //String heading = ;
        Assert.assertEquals(pb.getPersonalBankingHeading(),"PERSONAL BANKING");
    }

    @Test
    public void VerifyPersonalCheckinText(){
        hp= new HomePage(driver);
        pb = new PersonalBanking(driver);
        hp.clickPersonalBanking();
        //String heading = ;
        Assert.assertEquals(pb.isPersonalCheckinExist(),true);

    }

}
