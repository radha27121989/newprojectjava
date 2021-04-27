package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Actions a = new Actions(driver);
	WebElement product = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[10]"));
	//product.click();
   a.moveToElement(product).contextClick().perform();
   Robot r = new Robot();
	for (int i = 1; i < 5; i++) {
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
   
	
	
	
	
	
	
	
	
	
	
	
}
	

}
