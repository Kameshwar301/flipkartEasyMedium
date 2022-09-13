package practice.da1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	
		//Once Website Open Login dialogue box will open to interact create webelement
		WebElement loginPage = driver.findElementByXPath("//span[text()='Login']");
		//Username
		driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("9976171372");
		//password
		driver.findElementByXPath("//input[@type='password']").sendKeys("Kamesh@301");
		//to click login
		driver.findElementByXPath("(//span[text()='Login'])[2]").click();
		
		Thread.sleep(5000);
		WebElement search = driver.findElementByName("q");
		search.sendKeys("women watches");
		search.sendKeys(Keys.ENTER);
		WebElement down = driver.findElementByXPath("//select[@class='_2YxCDZ']");
		Select dropDown = new Select(down);
		dropDown.selectByValue("500");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElementByXPath("//img[@class='_3U-Vxu']");
		checkBox.click();
		
		//Dimension results = driver.findElementByClassName("_10Ermr").getSize();
		//System.out.println(results);
	//WebElement result = driver.findElementByClassName("_10Ermr");
			//System.out.println("The total results :" + result);
		
		
	//	WebElement mainMenu = driver.findElementByXPath("//div[text()='Fashion']");
		//Actions action = new Actions(driver);
	//	action.moveToElement(mainMenu).perform();				
	
	}

}
