package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id=\"inputValEnter\"]")).sendKeys("iphones X");
	driver.findElement(By.xpath("//span[@class=\"searchTextSpan\"]")).click();
	driver.findElement(By.xpath("//p[@title=\"iPhone X Shock Proof Case Shining Stars - Transparent\"]")).click();
	String par = driver.getWindowHandle();
	Set<String> chil = driver.getWindowHandles();
	for (String x : chil) {
		if(!x.equals(par)) {
			driver.switchTo().window(x);
		}
		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("//div[@id=\"add-cart-button-id\"]")).click();
		WebElement cli = driver.findElement(By.xpath("//input[@id=\"pincode-check\"]"));
		cli.click();
		cli.sendKeys("605108");

		/*WebElement cost = driver.findElement(By.xpath("(//span[text()=\"Rs. 174\"])[2]"));
		String text = cost.getText();
		System.out.println(text);*/
		
	}
	
	
}
	

}
