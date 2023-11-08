package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class maxminresizeclose {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().setSize(new Dimension(300,400));
	Thread.sleep(4000);
	driver.manage().window().setPosition(new Point(300,400));
	Thread.sleep(4000);
	driver.close();
	
}
}
