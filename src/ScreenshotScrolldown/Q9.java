package ScreenshotScrolldown;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement path = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		path.sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		Thread.sleep(5000);

		TakesScreenshot tk = (TakesScreenshot) driver;
		File sour = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Desktop\\scree\\Q9.png");
		FileUtils.copyFile(sour, dest);

	}
}
