package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement login = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	login.sendKeys("9952128754");
	WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	pass.sendKeys("12345");
	WebElement enter = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
	enter.click();
}
	

}
