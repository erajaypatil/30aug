package JavaStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertStudy {
	
	
	@Test
	public void asserStudy()
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		////////////AssertEquals and AssertNotEquals//////////////
	 WebElement Result = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1"));
	 String actualResult = Result.getText();
		String expectedResult = "Welcome, Please Sign In!";
		
		Assert.assertEquals(actualResult,expectedResult,"Result is not mathcing" );
		System.out.println("Result is mathcing succesfully");
		
		
		////////////////Assert true and flase//////////////////
		
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		boolean output = searchbox.isDisplayed();
		System.out.println(output);//true
		
		Assert.assertTrue(output,"serachbox text is not dispalyed");
		System.out.println("search box is displayed succesfully");
		
		
		////////////////assert false////////////
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
		boolean output1 = loginbutton.isSelected();
		Assert.assertFalse(output1,"button is selected");
		System.out.println("login button is not selected succuesfully");
		
		
		
		////////////////assertNull and assertNotNull////////////////
		WebElement emailunbox = driver.findElement(By.id("Email"));
		 String result = emailunbox.getText();
		Assert.assertNull(result,"emailbox is not null ");
		System.out.println("emailbox is null succesfully");
		
		
		
		
		System.out.println("edge driver run successfully");
		driver.close();
		
		
	}

}
