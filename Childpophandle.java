package JavaStudy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childpophandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement windowTab = driver.findElement(By.name("NewWindow"));
		windowTab.click();
		
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);
		
		//id of main page
		
	   String idofmainpage=driver.getWindowHandle();
	   System.out.println(idofmainpage);//468EB1071A732A0E7889A40D4F401543
	   
	   //id of 
	   
	   Iterator<String> it = Allwindows.iterator();
	   
	   String mainpage = it.next();
	   String childpage = it.next();
	   
	   driver.switchTo().window(childpage);
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Ajay rokade patil");
	   
	   
	   System.out.println("program run succesfully");
	   Reporter.log("program run successfully",true);
	   Thread.sleep(2000);
	   driver.close();
	}

}
