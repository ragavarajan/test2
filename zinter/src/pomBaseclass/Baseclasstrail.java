package pomBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclasstrail {

	static WebDriver driver;
	
	public static WebDriver openbrowser(String url,String browser) throws InterruptedException
	{
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\firefox.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			return driver;
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			return driver;
		}
		return driver;
	
				/*		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;*/
				
	
	}	
}
