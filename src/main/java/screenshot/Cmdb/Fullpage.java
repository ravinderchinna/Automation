package screenshot.Cmdb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fullpage {
	WebDriver d; 
	String url = "";
	@Test
	public void launch() throws Exception
	{
		//if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodrive");
			
			  d = new FirefoxDriver();
		 
		  // If browser is IE, then do this	  
		 
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();*/
		 d.get(url);
		 System.out.println(d.manage().window().getSize());
		 d.manage().window().maximize();
		}
	public void test()
	{
	System.out.println("test");	
	}
	public void eshwar()
	{
		System.out.println("hi eshwar");
	}
	}


