package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//senario:
//open the browser
//enter demo.actitime.com
//login to the applications
//verity home page
//close the browser
public class synchonization {
public static void main(String[] args) throws Exception {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--allow-remote-origins=*");
	System.getProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver(options);
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.id("")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.name("")).sendKeys("manager");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
}
}
