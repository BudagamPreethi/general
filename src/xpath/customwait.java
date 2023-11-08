package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class customwait {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[text()='start']")).click();
		int count =0;
		while(count<20) {
			try {
				String text =driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
				System.out.println(text);
				break;
				
			}
			catch(Exception e) {
				count++;
				Thread.sleep(1000);
			
			}
		}
		driver.quit();
	}

}
