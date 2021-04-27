package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
		// driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9952128754");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("radha");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("radhamechmoha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();

	}

}
