package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
	WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	user.sendKeys("radha");
	System.out.println(user.getAttribute("value"));
	WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	pass.sendKeys("1234");
	System.out.println(pass.getAttribute("value"));
	driver.close();
	
}
	

}
