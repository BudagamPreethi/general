package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expilictly {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.className("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebElement pageTitle =driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}

}
