package xpath;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class titlecontains {

	public static void main(String[] args) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("https://www.orangehrm.com/");
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
			try {
				wait.until(ExpectedConditions.titleContains("OrangeHRM"));
				System.out.println("test passed");
				
			}catch(Exception e) {
				System.out.println("test failed");
			}
driver.close();
	}

}
