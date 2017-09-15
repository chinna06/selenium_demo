package chinna_demo.chinna;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AppTest{
	@Test
	public static void main() throws InterruptedException
    {
WebDriver driver = new FirefoxDriver();
		
		//Launching Sample site
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		//Right click in the TextBox
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.xpath(".//*[@id='commonWebElements']/p[1]/a"));
		Thread.sleep(3000);
		action.contextClick(searchBox).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		//Thread.sleep just for user to notice the event
		
		
		//Closing the driver instance
		//driver.quit();
    }
   }
