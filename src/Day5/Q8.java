package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q8 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	Actions a = new Actions(driver);
	WebElement dept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
	a.moveToElement(dept).perform();
	WebElement heat = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
	a.moveToElement(heat).perform();
	Thread.sleep(5000);
	WebElement air = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
	a.moveToElement(air).perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();
}
	
}







