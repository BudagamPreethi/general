package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class submit_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchTF =driver.findElement(By.id("twotabsearchtextbox"));
		searchTF.sendKeys("");
		Thread.sleep(2000);
		searchTF.sendKeys("shoes");
		searchTF.clear();
		WebElement searchTF1=driver.findElement(By.id("twotabsearchtextbox"));
		searchTF1.sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("")).submit();
	}

}
