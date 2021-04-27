package DropDow;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.click();
		user.sendKeys("mages123");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.click();
		pass.sendKeys("malar123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(loc);
		List<WebElement> s1 = s.getOptions();
		for (WebElement x : s1) {
			System.out.println(x.getText());
		}
			
		}
}
