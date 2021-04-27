package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	Keys t = Keys.TAB.ENTER;
    driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9952128754");
 
 
 
	
	//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border'][1]")).click();
	
}
	

}
