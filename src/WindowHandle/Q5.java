package WindowHandle;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Q5 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Robot r = new Robot();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()=\"COURSES\"]"))).perform();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		a.moveToElement(driver.findElement(By.xpath("(//button[text()=\"Explore Curriculum\"])[2]"))).contextClick().perform();
		for (int i = 1; i < 3; i++) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File Source = tk.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\HP\\Desktop.img");
		FileUtils.copyFile(Source, Dest);
	}
	
}
