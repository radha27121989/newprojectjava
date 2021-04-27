package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Actions a = new Actions(driver);
	WebElement sig = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	a.moveToElement(sig).perform();
	driver.findElement(By.xpath("(//a[text()='Start here.'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("radha");
	driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("09873434");
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("radhamechmoha@rm@gmail.com");
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("12354");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	
	}

}
