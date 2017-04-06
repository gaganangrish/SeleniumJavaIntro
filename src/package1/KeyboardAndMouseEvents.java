package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseEvents {
	
	WebDriver driver;

	@Before
	public void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
		//Specifying the path of Chrome driver exe file
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
		//Creating an object of ChromeDriver class and saving the Object with name as driver
		//in WebDriver data type. WebDriver Class is a parent class of ChromeDriver class
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}

	@After
	public void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void mouseHover() throws InterruptedException {
		
		//locating webelement using link text
		WebElement partialLink = driver.findElement(By.linkText("Partial Link Test"));
		
		//Creation an object of Actions class
		Actions aobj = new Actions(driver);
		
		//Moving to element (mouse hover). Build() and Perform() is prefixed in the end.
		aobj.moveToElement(partialLink).build().perform();
		
		Thread.sleep(2000);
		
	}
	
	@Test
	public void keyBoardEvent() throws InterruptedException {
		
		//locating webelement using xpath - first name field
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		//Creation an object of Actions class
		Actions aobj = new Actions(driver);
		
		//Moving to element (mouse hover) and then clicking. Build() and Perform() is prefixed in the end.
		aobj.moveToElement(fName).click().keyDown(fName,Keys.LEFT_SHIFT).sendKeys(fName, "first name in caps").keyUp(fName, Keys.LEFT_SHIFT).build().perform();
		
		Thread.sleep(5000);
		
	}


}
