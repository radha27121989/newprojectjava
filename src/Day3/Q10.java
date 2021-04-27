package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("radha");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mohan");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("radhamechmohan");
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("12345678");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
			
}
	

}
