package JavaStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class downloadfile {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://file-examples.com/index.php/sample-documents-download/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//
		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[3]/a")).click();
		try {
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
		}
		catch(Exception e)
		{
			System.out.println("program run succesfully");
		}
		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(200);
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("program run sucessfully");
		
	}

}
