package JavaStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestrun {
	WebDriver driver;
	
	@Test
	public void chrome() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//scroll page up and down
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(800,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(800,-800)");
		Thread.sleep(2000);
		System.out.println("scroll page up and down succesfully");
		
		//scrolling into veiw
		try
		{
		WebElement text = driver.findElement(By.xpath("//*[@id=\"features\"]/div/div[2]/div/h3"));
		JavascriptExecutor js1=((JavascriptExecutor)driver);
		js1.executeScript("argument[0].scrollintoView(true);",text);
		System.out.println("scroll view successfully");
		}
		catch(Exception e)
		{
			System.out.println("catch prog run succesfully");
		}
		//set size
		
		Dimension d=new Dimension(100,10);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		System.out.println("firefox method run succesfully");
		driver.close();
	}

}
