package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Actions a = new Actions(driver);
	WebElement mo = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
	a.moveToElement(mo).perform();
	driver.findElement(By.xpath("//span[text()='New Launches Covers']")).click();

}
}
		
