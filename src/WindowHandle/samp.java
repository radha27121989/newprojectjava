package WindowHandle;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samp {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File Source = tk.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\HP\\Desktop\\scree\\mad.png");
		FileUtils.copyFile(Source, Dest);

}}
