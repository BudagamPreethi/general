package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class userpwdlogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver(option);
driver.get("");
driver.manage().window().maximize();
Thread.sleep(4000);
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(4000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(4000);
driver.findElement(By.className("initial")).click();

	
	}

}
