package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
public static void main(String[] args) {
	System.setProperty("weddriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
WebElement user = driver.findElement(By.id("username"));
user.sendKeys("radh");
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("1234");


	
}
}
