package utilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class Base extends ExcelUtlilties
{
	
	 public static WebDriver dr;
	
	 
		public void launch_browser() throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			dr = new EdgeDriver();
			dr.get("https://automationexercise.com/");
			dr.manage().window().maximize();
			Thread.sleep(4000);
		}
		
		//Common Methods
		
		public static void get_screenshot(String filename) throws IOException
		{
			String path = "C:\\Users\\ankit\\Desktop\\Ekta Jobs\\Study\\Software testing\\Software Testing\\Project\\Autmation\\Screenshots", fullpath;
			fullpath = path + filename;
			TakesScreenshot scr = ((TakesScreenshot)dr);
			File scrf = scr.getScreenshotAs(OutputType.FILE);
			File dest = new File(fullpath);
			FileUtils.copyFile(scrf, dest);
		}
		
		protected static void close_browser() 
		{
			dr.close();
		}
		
		public void windowHandles() 
		{
			
			String mainWindowHandle = dr.getWindowHandle();
		
			for(String windowHandle : dr.getWindowHandles()) 
			{
				if (!windowHandle.equals(mainWindowHandle)) 
				{
		            dr.switchTo().window(windowHandle);
		            break;
		        }
			
			}
			
		}
		
		
		public void scrollDownC(int pixelsToScroll) 
		{
		    JavascriptExecutor js = (JavascriptExecutor) dr;
		    // Scroll down by specified pixels vertically
		    js.executeScript("window.scrollBy(0," + pixelsToScroll + ")");
		}

		public void downloadDocument(String downloadUrl, String downloadPath, String downloadButtonXPath) 
		{
	        
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("download.default_directory", downloadPath);
	        prefs.put("download.prompt_for_download", false);
	        prefs.put("profile.default_content_settings.popups", 0);

	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", prefs);

	        dr = new ChromeDriver(options);

	        try {
	           
	            dr.get(downloadUrl);

	            WebElement downloadButton = dr.findElement(By.xpath(downloadButtonXPath));
	            downloadButton.click();

	            Thread.sleep(10000); 

	        } catch (Exception e) 
	        {
	            e.printStackTrace();
	        } finally 
	        {
	           
	            dr.quit();
	        }
		}
		
		
		
}
