package JavaStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", null)
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();
		
		driver.findElement(By.name("file")).sendKeys("C:\\Downloads\\21.LIST BOX.docx");
		
		System.out.println("program run succesfully");
		
		
		
		///
	}

}
