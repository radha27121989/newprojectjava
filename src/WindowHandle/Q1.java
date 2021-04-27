package WindowHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("iphones X");
		search.click();
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		WebElement product = driver.findElement(By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[1]"));
		Actions a = new Actions(driver);
		a.contextClick(product).perform();
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		String t = driver.getWindowHandle();
		String par = driver.getTitle();
		// System.out.println(title);
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!x.equals(par)) {
				driver.switchTo().window(x);
			}
		}
		WebElement rate = driver.findElement(By.xpath("//a[@id=\"bylineInfo\"]"));
		String text1 = rate.getText();
		System.out.println(text1);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File Source = tk.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\HP\\Desktop.png");
		FileUtils.copyFile(Source, Dest);

	}
}
