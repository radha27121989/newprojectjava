package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(7000);
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//h3[@id=\"Python-Solutions-Architect-Training\"])[4]")).click();
		driver.findElement(By.xpath("//h3[text()=\"Selenium Day 10 Task\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Windows Handling\"]")).click();

	}
}
