package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkart_sech_iphone11 
{
	public static void main(String[] args) throws Exception {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		 driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("iphone11");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.cssSelector("svg[width='20']")).click();
		 Thread.sleep(3000);
		 
		 driver.close(); 
		 
		 
		
	}
	

}
