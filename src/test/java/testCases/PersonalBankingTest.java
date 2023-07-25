package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PersonalBanking;

public class PersonalBankingTest extends InIt{

    HomePage hp = new HomePage(driver);
    PersonalBanking pb = new PersonalBanking(driver);

    @Test
    public void verifyPersonalBanking(){
        hp.clickPersonalBanking();
    }

    @Test
    public void VerifyHeading(){
        hp.clickPersonalBanking();
        String heading = pb.getPersonalBankingHeading();

    }

}
