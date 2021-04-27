package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
	user.sendKeys("radha");
	System.out.println(user.getAttribute("value"));
	WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("1234");
	System.out.println(pass.getAttribute("value"));
	driver.close();
}
	

}
