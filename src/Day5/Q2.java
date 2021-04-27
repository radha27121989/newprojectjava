package Day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
	WebElement prime = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow null'])[4]"));
	a.moveToElement(prime).perform();
	driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
}
	

}
