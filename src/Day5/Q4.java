package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement sports = driver.findElement(By.xpath("(//li[@onmouseover='mouseoverNavigation(this);'])[6]"));
	Actions a = new Actions(driver);
	a.moveToElement(sports).perform();
	driver.findElement(By.xpath("//a [text()='Weight Gainers']")).click();
}
	

}
