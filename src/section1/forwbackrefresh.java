package section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class forwbackrefresh {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ChromeOptions option =new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver(option);
driver.get("https://www.myntra.com/");
Thread.sleep(4000);


	}

}
