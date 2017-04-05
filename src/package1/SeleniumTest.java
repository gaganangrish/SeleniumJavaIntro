package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Specifying the path of Chrome driver exe file
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//Creating an object of ChromeDriver class and saving the Object with name as driver
		//in WebDriver data type. WebDriver Class is a parent class of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//driver.get function to navigate to a URL
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		// To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
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
		
		//Checking page title
		if (pageTitle.equalsIgnoreCase("Demo Form for practicing Selenium Automation")) {
			System.out.println("Test Passed");			
		}else {
			System.out.println("Test Failed. The actual page title is: "+pageTitle+" and expected is: Demo Form for practicing Selenium Automation");
		}
		
		//to close the open driver session
		driver.quit();
		
	}

}
