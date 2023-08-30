package JavaStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTEsting {
	
	WebDriver driver;
	@Parameters("browserName")
	@Test
	public void ct(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selinium\\ChromeDriver.exe\\chromedriver_win32 (4)\\chromedriver.exe");
		    driver=new ChromeDriver();
			
			
			
		}
		
		else if(browserName.equals("firefox"))
		{
			
			System.setProperty("webdriver.firefox.driver","C:\\selinium\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		    driver=new FirefoxDriver();
			
		}
		
		driver.get("https://demo.nopcommerce.com/login");
	}

}
