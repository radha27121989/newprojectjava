package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.homedepot.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id=\"headerSearch\"]")).sendKeys("celling fan");
	driver.findElement(By.xpath("//button[@id=\"headerSearchButton\"]")).click();
	driver.findElement(By.xpath("(//span[@class=\"product-pod__title__product\"])[1]")).click();
	String par = driver.getWindowHandle();
	Set<String> chil = driver.getWindowHandles();
	for (String x : chil) {
		if(!x.equals(par)) {
			driver.switchTo().window(x);
		}	
	}
	driver.findElement(By.xpath("(//div[text()=\"Control Type Included\"])[1]")).click();


	

	
}
	

}
