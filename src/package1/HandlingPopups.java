package package1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before class");
		//Specifying the path of Chrome driver exe file
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
		//Creating an object of ChromeDriver class and saving the Object with name as driver
		//in WebDriver data type. WebDriver Class is a parent class of ChromeDriver class
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/gagan_000/workspace/SeleniumJavaIntro/popups.html");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void popUpHandleing() throws InterruptedException {
		
		//locating button web element
		WebElement button = driver.findElement(By.xpath("//button"));
		
		//Clicking on the button to get an alert
		button.click();
		
		Thread.sleep(2000);
		
		//Creating an object of alert and switching focus
		Alert alert = driver.switchTo().alert();
		
		//accepting alert
		alert.accept();
		
		Thread.sleep(2000);
		
		//Clicking on the button to get an alert
		button.click();
		
		Thread.sleep(2000);
		
		//Creating an object of alert and switching focus
		alert = driver.switchTo().alert();
		
		//printing alert text
		String alertText = alert.getText();
		System.out.println("Alert Text is: "+alertText);
		
		//rejecting alert
		alert.dismiss();
		
		Thread.sleep(2000);
		
	}

}
