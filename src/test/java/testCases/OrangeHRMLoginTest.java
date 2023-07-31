package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser

 */
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		//2) open url on the browser
		driver.get("https://www.websterbank.com/");
		driver.manage().window().maximize(); // maximize the page
		Thread.sleep(2000);
		driver.findElement(By.linkText("Personal Checking")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[contains(.,'Commercial')]")).isDisplayed());
		driver.findElement(By.xpath("//span[contains(.,'Commercial')]/parent::li")).click();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		
	}

}
