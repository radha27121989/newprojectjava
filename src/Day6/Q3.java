package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
		Robot a = new Robot();
		WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		Actions t = new Actions(driver);
		t.contextClick(cts).perform();
		a.keyPress(KeyEvent.VK_PAGE_DOWN);
		a.keyRelease(KeyEvent.VK_PAGE_DOWN);
		a.keyPress(KeyEvent.VK_PAGE_DOWN);
		a.keyRelease(KeyEvent.VK_PAGE_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);




	}

}
