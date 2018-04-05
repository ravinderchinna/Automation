package screenshot.Cmdb;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void capturescreenshot(WebDriver d, String screenshotName) 
	{
		try {
			
			File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			
			/*TakesScreenshot ts =(TakesScreenshot)d;
			File src = ts.getScreenshotAs(OutputType.FILE);*/
			FileUtils.copyFile(src, new File("D:\\"+screenshotName+".png"));
		} 	
		catch (Exception e) {
		System.out.println("Exception while taking screen shot" +e.getMessage());
		}
	     
	}

}
