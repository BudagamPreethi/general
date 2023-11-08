package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver(option);
driver.get("https://www.myntra.com/");
	Thread.sleep(4000);
	driver.get("https://www.ajio.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	Navigation n=driver.navigate();
	n.back();
	Thread.sleep(4000);
	n.forward();
	Thread.sleep(4000);
	driver.manage().window().setSize(new Dimension(400,300));
	Thread.sleep(4000);
	driver.manage().window().setPosition(new Point(300,400));
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(4000);
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	System.out.println(title);
	System.out.println(url);
	Thread.sleep(4000);
	driver.close();
	
	}

}
