package ScreenshotScrolldown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File souce = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Desktop\\scree\\Q1.png");
		FileUtils.copyFile(souce, dest);
	}

}
