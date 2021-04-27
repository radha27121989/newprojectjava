package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q8 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("radha");
		Actions a = new Actions(driver);
		a.moveToElement(email).doubleClick().perform();
		String email1 = email.getAttribute("value");
		Robot t = new Robot();

		t.keyPress(KeyEvent.VK_CONTROL);
		t.keyPress(KeyEvent.VK_C);
		t.keyRelease(KeyEvent.VK_CONTROL);
		t.keyRelease(KeyEvent.VK_C);
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.click();
		t.keyPress(KeyEvent.VK_CONTROL);
		t.keyPress(KeyEvent.VK_V);
		t.keyRelease(KeyEvent.VK_CONTROL);
		t.keyRelease(KeyEvent.VK_V);
		String pass1 = pass.getAttribute("value");
		if (email1.equalsIgnoreCase(pass1)) {
			System.out.println("correct");
		} else {
			System.out.println(pass1);

		}

	}

}
