package section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrometitlebrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeOptions option=new ChromeOptions();
 option.addArguments("--remote-allow-origins=*");
 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
 ChromeDriver driver =new ChromeDriver(option);
 driver.get("https://www.ajio.com/");
 String Title=driver.getTitle();
 String srcCode =driver.getPageSource();
 String Url=driver.getCurrentUrl();
 /*System.out.println(Title);
 System.out.println(srcCode);*/
 System.out.println(Url);
}

}
