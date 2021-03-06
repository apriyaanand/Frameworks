package KeywordDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	WebDriver driver;
	
	public void openApplication(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}

	public void enterTextBox(String locValue, String testData) {
		driver.findElement(By.id(locValue)).sendKeys(testData);
	}
	
	public void clickButton(String loc, String locValue) {
		
		if(loc.equals("name")) {
		driver.findElement(By.name(locValue)).click();
	}
		else if(loc.equals("xpath")) {
			driver.findElement(By.xpath(locValue)).click();
		}
	}
	
	public String getMessage(String loc, String locValue) {
		String verifyMsg = null;
		if(loc.equals("cssSelector")) {
		verifyMsg = driver.findElement(By.cssSelector(locValue)).getText();
		}
		else if(loc.equals("id")) {
			verifyMsg = driver.findElement(By.id(locValue)).getText();
		}
		return verifyMsg;
	}
	public void closeApplication() {
		driver.quit();
	}
}
