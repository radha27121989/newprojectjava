package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().fullscreen();
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone"+Keys.ENTER);

WebElement findElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
String a = findElement.getAttribute("value");
	System.out.println(a);
	String t = driver.getCurrentUrl();
	System.out.println(t);
	driver.close();

	
}
	

}
