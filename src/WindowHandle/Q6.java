package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("hand sanitizer");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@title='LA ORGANO Pocketizer Hand Sanitizer 18 mL Pack of 5']")).click();
		//driver.findElement(By.xpath("")).click();
		String par = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if(!x.equals(par)) {
				driver.switchTo().window(x);
			}	
		}
		driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();




		
	

}}
