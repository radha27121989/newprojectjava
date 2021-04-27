package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement rpa = driver.findElement(By.xpath("//a[text()='RPA']"));
		Actions r = new Actions(driver);
		r.contextClick(rpa).perform();
		Robot t = new Robot();
		for (int i = 1; i < 7; i++) {
			t.keyPress(KeyEvent.VK_PAGE_DOWN);
			t.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		

	}

}
