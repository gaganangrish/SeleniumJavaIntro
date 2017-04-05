package package1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJunitTest {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
		//Specifying the path of Chrome driver exe file
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
		//Creating an object of ChromeDriver class and saving the Object with name as driver
		//in WebDriver data type. WebDriver Class is a parent class of ChromeDriver class
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
		//to close the open driver session
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
		//driver.get function to navigate to a URL
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		// To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
	}

	@Test
	public void test() {
		//Finding First Name, Last Name and Submit buttons on the page using xPath
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		
		//Entering text in First Name field
		fName.clear();
		fName.sendKeys("Testing");
		
		//Entering text in Last Name field
		lName.clear();
		lName.sendKeys("Selenium");
		
		//Clicking the submit button
		submitButton.click();
		
		//Getting the page title once the page reloads
		String pageTitle = driver.getTitle();
		
		String expectedPageTitle = "Demo Form for practicing Selenium Automation";
		//Checking page title
//		if (pageTitle.equalsIgnoreCase("Demo Form for practicing Selenium Automation")) {
//			System.out.println("Test Passed");			
//		}else {
//			System.out.println("Test Failed. The actual page title is: "+pageTitle+" and expected is: Demo Form for practicing Selenium Automation");
//		}
		assertTrue("Test Failed. The actual page title is: "+pageTitle+" and expected is: "+expectedPageTitle, pageTitle.equalsIgnoreCase(expectedPageTitle));
	}

}
