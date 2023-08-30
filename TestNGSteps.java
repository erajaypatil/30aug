package JavaStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSteps {
	WebDriver driver;
	
	@BeforeClass
	public void BeforeClassMethod()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser Launch sucessfully",true);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		Reporter.log("Application Login succesfully",true);
		
	}
	
	@Test(invocationCount=2)
	public void test()
	{
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Reporter.log("test sucesfully",true);
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
		Reporter.log("browser colse sucessfully",true);
		
	}

	@AfterClass
	public void afterclass()
	{
		driver.quit();
		Reporter.log("all browser colse succesfully",true);
	}
}
