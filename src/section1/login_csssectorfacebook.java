package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login_csssectorfacebook {

	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("");
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}

}
