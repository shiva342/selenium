package selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	@Test
	public void searchTestCase() throws Exception {
		WebDriverManager.chromedriver().setup();  //call the chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open application.
		driver.get("https://web.whatsapp.com/");
		
	
		//take screenshot //type casting.
		String path= "C:\\Users\\91824\\eclipse-workspace\\selenium\\src\\test\\resources\\screenshot\\";
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(path+".jpg");
		FileUtils.copyFile(srcFile, destFile);
		
		driver.close();
		
		
	}
}
	
	
	
	
	
	
	
	