package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifytitle {
	@Test
	public void man() {
			
			//open browser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new  ChromeDriver();
			driver.get("https://www.google.co.in/");
			//search for content
			WebElement googlesearchbox= driver.findElement(By.name("q"));
			googlesearchbox.sendKeys("laptops");
			googlesearchbox.submit();
			//verify page title
			String expectedtitile="laptops - Google Search"; 
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
			
			if (expectedtitile.equals(actualtitle)) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
			//verify url
			String expectedurl="https://www.google.co.in/search?q=laptops";
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			if (actualurl.contains(expectedurl)) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
			driver.close();
		}

}
