package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disableenabled {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginButton =driver.findElement(By.xpath("//button[.='Log in']"));
		if(loginButton.isEnabled()) 
		System.out.println("Enabled");
		else
		System.out.println("Disabled");
		driver.findElement(By.name("username")).sendKeys("456789009876");
		driver.findElement(By.name("password")).sendKeys("987654367890");
		if(loginButton.isEnabled())
		{
			System.out.println("Enabled");
			loginButton.click();
			
		}
		else
			System.out.println("Disabled");
		driver.quit();
	}

}
