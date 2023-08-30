package JavaStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel1 {
	
	
	@Test
	public void parllel()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		System.out.println("chromedriver prog run succesfully");
		driver.close();
	}

}
