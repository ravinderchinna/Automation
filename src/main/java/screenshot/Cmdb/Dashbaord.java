package screenshot.Cmdb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dashbaord {		
	WebDriver d; 
	String url = "";
	@Test
	public void launch() throws Exception
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
		
		  d = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();*/
		 d.get(url);
		 d.manage().window().maximize();
		 Thread.sleep(5000);
		 Utility.capturescreenshot(d,"Cmdashboard" );
		 Thread.sleep(3000);
	     d.quit();	
	}
		
	}
