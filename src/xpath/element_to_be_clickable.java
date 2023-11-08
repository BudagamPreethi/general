package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class element_to_be_clickable {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginButton =driver.findElement(By.xpath("//button[.='Log in']"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
			System.out.println("login button enabled");
			
		}catch(Exception e) {
			System.out.print("login button desable");
			
		}
driver.findElement(By.name("username")).sendKeys("34567890987654");
driver.findElement(By.name("password")).sendKeys("34567890987654");
try {
	wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	System.out.println("login button enabled");
	
}catch(Exception e) {
	System.out.print("login button desable");
	
}
	}
	

}
