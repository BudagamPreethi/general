package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {

	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@title,'Read')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@title,'Check')]")).click();
		Thread.sleep(4000);

	}

}
