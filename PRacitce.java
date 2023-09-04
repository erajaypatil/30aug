package JavaStudy;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PRacitce {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//find how many elements presrnt in login page
		
	     List<WebElement> elemtnslist = driver.findElements(By.tagName("a"));
	     System.out.println(elemtnslist.size());
	     
	     for(  WebElement ellist: elemtnslist)
	     {
	         System.out.println(ellist.getText());
	         
	     }
		//mouse actions
	     WebElement computers = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
	     WebElement desktop = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
	     WebElement notebook = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"));
	     WebElement software = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"));
	     Actions act=new Actions(driver);
	     act.moveToElement(computers).build().perform();
	     Thread.sleep(2000);
	     act.moveToElement(desktop).build().perform();
	     Thread.sleep(2000);
	     act.moveToElement(notebook).build().perform();
	     Thread.sleep(2000);
	     act.moveToElement(software).click().build().perform();
	     Thread.sleep(2000);
	     driver.navigate().back();
	     
	     
	     WebElement Electronics = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]"));
	     WebElement cameranadphots = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
	     WebElement cellphome = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
	     WebElement others = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
	     
	     act.moveToElement(Electronics).build().perform();
	     Thread.sleep(2000);
	     act.moveToElement(cameranadphots).build().perform();
	     Thread.sleep(2000);
	     act.moveToElement(others).build().perform();
	     Thread.sleep(2000);
	     act.moveToElement(cellphome).click().perform();
	     Thread.sleep(2000);
	     driver.navigate().back();
	     
	  //   act.moveToElement(computers).moveToElement(desktop).moveToElement(notebook).moveToElement(software).moveToElement(others).build().perform();
	     
	     
	     //how to get cookies on page
	     driver.manage().getCookies();
	     System.out.println("Totatl cookies present on page are "+driver.manage().getCookies());
	      driver.manage().deleteAllCookies();
	     //actions calss use
	     WebElement emailbox = driver.findElement(By.id("Email"));
		 WebElement passwordtextbox = driver.findElement(By.id("Password"));
	    
	     
	     //to send data we can use java script or sendkeys metthods
	     emailbox.sendKeys("ajayrokadepatilpune");
	    
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("a");
	     act.keyUp(Keys.CONTROL);
	     act.perform();
	     
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("c");
	     act.keyUp(Keys.CONTROL);
	     act.perform();
	     
	     
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("v");
	     act.keyUp(Keys.CONTROL);
	     act.perform();
	     
		
		///javascript scrolling page  
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(800,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(800,-800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-800,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-800,-800)");
		Thread.sleep(2000);
		
		
		
		
		//send data using javascript executor
	   
	    WebElement button = driver.findElement(By.linkText("Log in"));
	    
	    js.executeScript("arguments[0].value='ajayrokade'", emailbox);
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].value='ajry154212145'",passwordtextbox);
	    Thread.sleep(2000);
	    
	    //click on button using java script executor
	    js.executeScript("arguments[0].click()",button );
	    
	    
	    
	    //scrrenshot 
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\selinium\\screenShot\\noplogin.png");
		 FileHandler.copy(src, dest);
		 Thread.sleep(2000);
		
		//javascript use to set size of page
       
	    System.out.println("size of the browser is "+driver.manage().window().getSize());
	    Thread.sleep(2000);
	    
	    Dimension d=new Dimension(100,80);
	    driver.manage().window().setSize(d);
	    Thread.sleep(2000);
	    
	   System.out.println("we got size of the browser is "+ driver.manage().window().getSize());
	    Thread.sleep(2000);
	    
	    //javascript use to set position
	    System.out.println(driver.manage().window().getPosition());
	    Thread.sleep(2000);
	    
	    Point p=new Point(800,500);
	    
	    driver.manage().window().setPosition(p);
	 
	 ///
	    
		System.out.println("program run succesfully");
		driver.close();

	}

}
