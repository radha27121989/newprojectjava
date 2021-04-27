package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Robot a = new Robot();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		email.sendKeys("radha");
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_A);
		a.keyRelease(KeyEvent.VK_A);
		a.keyPress(KeyEvent.VK_C);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_C);
	 driver.findElement(By.xpath("//input[@id='pass']")).click();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_V);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_V);
		


	}

}
