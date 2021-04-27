package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
	WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	search.sendKeys("velmurugan");
	Actions t = new Actions(driver);
	t.doubleClick(search).perform();
	Robot a = new Robot();
	a.keyPress(KeyEvent.VK_CONTROL);
	a.keyPress(KeyEvent.VK_X);
	a.keyRelease(KeyEvent.VK_CONTROL);
	a.keyRelease(KeyEvent.VK_X);
			
	
}
	

}
