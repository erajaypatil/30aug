package JavaStudy;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTestcases {
	
	
	@Test
	public void test() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/desktops");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
          WebElement searchtab = driver.findElement(By.id("small-searchterms"));
          WebElement searchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        
          ///use of javascript for send and click operation 
        JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].value='ajayrokade'",searchtab);
	    jse.executeScript("arguments[0].click()",searchbutton);
	    
	    //screenshot 
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   File dest=new File("C:\\selinium\\screenShot\\nop.png");
	   
	   FileHandler.copy(src, dest);
	   
	   //using javascript executeor scroll page
	   
	   jse.executeScript("window.scrollBy(800,800)");
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(800,-800)");
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(-800,800)");
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(-800,-800)");
	   Thread.sleep(2000);
	   
	   
	   //using javascript executor scroll into view
	   WebElement contactustext = driver.findElement(By.linkText("Contact us"));
	   JavascriptExecutor je=(JavascriptExecutor)driver;
	   
	 //  je.executeScript("arguments[0].scrollintoView(true);",contactustext);
	   
	   //set size
	   
	   
	  System.out.println( driver.manage().window().getSize());
	   Dimension d=new Dimension(1000,10);
	   driver.manage().window().setSize(d);
	   System.out.println(driver.manage().window().getSize());
	   
	   
	   //set position
	   System.out.println(driver.manage().window().getPosition());
	   Thread.sleep(2000);
	   //to set position use point class to create obj of point class
	   
	   Point p=new Point(800,500);
	   driver.manage().window().setPosition(p);
	   
	    Thread.sleep(2000);
	    System.out.println("program run successfully");
	    driver.close();
	    
	}
	
	
	
	@Test(enabled=false)
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/desktops");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.findElement(By.id("small-searchterms")).sendKeys("ajyarokade");
	    
	    System.out.println("program run successfully");
	    
	}
	
	
	
	

}
