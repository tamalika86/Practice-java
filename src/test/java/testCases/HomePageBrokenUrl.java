package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.util.HashMap;

public class HomePageBrokenUrl extends InIt {
    HomePage hp;

    @Test
    public void verifyLinks() {
        hp = new HomePage(driver);
        HashMap myMap = hp.verifyLinks();
        //for(HasMap mmap : myMap){

        //System.out.println();
    }
}
