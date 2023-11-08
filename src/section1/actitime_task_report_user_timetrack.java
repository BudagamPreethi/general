package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitime_task_report_user_timetrack {
	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
		

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[class='content tasks']")).click();	
		Thread.sleep(3000);
		
		driver.findElement(By.id("container_reports")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("container_users")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[id='container_tt']")).click();
		Thread.sleep(3000);
		
		driver.close();

		
		
		
		driver.close();

		
		
	}

}
