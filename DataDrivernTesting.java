package JavaStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivernTesting {
	
	
	@Test(dataProvider="orangeHRM")
	public void verifyLogin(String username, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    System.out.println("Current url of orange hrm is "+driver.getCurrentUrl());
		
		System.out.println("page source is "+driver.getPageSource());
		
		System.out.println("title of the page is "+driver.getTitle());
		
		System.out.println("window id is "+driver.getWindowHandle());
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String actualResult = "Dashboard";
		
		WebElement dashboardText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		String expectedResult = dashboardText.getText();
		
		Assert.assertEquals(expectedResult, actualResult,"result is not matching");
		
		System.out.println("program run succesfully");
		
		Reporter.log("result matching succesfully",true);
		
		driver.close();
		
		
		
	}
	
	
	@DataProvider(name="orangeHRM")
	public Object[][] passdata()
	{
		Object data[][]=new Object[3][2];
		
		data[0][0]="ajayrokade@001gmail.com";
		data[0][1]="ajayrokade@001gmail.com";
		
		data[1][0]="ajayrokade@001gmail.com";
		data[1][1]="ajayrokade@001gmail.com";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		return data;
		
	}

}
