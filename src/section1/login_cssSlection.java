package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login_cssSlection {

	public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
	}
}
