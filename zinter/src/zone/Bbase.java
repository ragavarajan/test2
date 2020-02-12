package zone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbase {

	
	static WebDriver driver;
	
	public static WebDriver open(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		return driver;
		
	}
}
