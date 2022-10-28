package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertiesfile {

 @Test
 public void abc() throws Exception {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 
	 String path = "C:\\Users\\91824\\eclipse-workspace\\selenium\\src\\test\\resources\\screenshot\\config.properties";
	 FileInputStream f = new FileInputStream(path);
	 Properties prop = new Properties();
	 prop.load(f);
	 String abc = prop.getProperty("url");
	 driver.get(abc);
	 
	 
	 
	 
 }
	
	
	
	
	
	
}
