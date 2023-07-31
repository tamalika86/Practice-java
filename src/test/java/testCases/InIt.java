package testCases;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;

public  class InIt {
	
	
	public  WebDriver driver;
	public String methodName;
	
	@BeforeClass
	void intialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	void setup(Method method){
		driver.get("https://www.websterbank.com/");
		driver.manage().window().maximize();
		methodName = method.getName();
	}

	@AfterMethod
	public void nameAfter(Method method)
	{
		System.out.println("Test name: " + method.getName());
	}

	@AfterClass
	void tearDown() {
		driver.quit();

	}
}
