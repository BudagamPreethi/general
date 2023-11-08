package section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//step6: import chromedriver

public class launchchromebrowser {

	public static void main(String[] args) {
	
//step 2:create object chromebrowser
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		
		
	}

}
