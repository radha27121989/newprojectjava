package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphone"+Keys.ENTER);
	driver.findElement(By.xpath("//img[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black']")).click();
}
	

}
