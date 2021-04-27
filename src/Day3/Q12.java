package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9952128754");
	driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
}
	

}
