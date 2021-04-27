package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");                               
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).click();
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		 driver.switchTo().frame(0);
		WebElement user = driver.findElement(By.id("userName"));
		user.click();
		user.sendKeys("9952128754");
		 //driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();

	}

}
