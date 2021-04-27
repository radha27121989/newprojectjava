package Day8alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("TuringSession"));
		driver.switchTo().frame(element);
		Thread.sleep(5000);
		Actions	 a = new Actions(driver);
		WebElement sig = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		a.moveToElement(sig).perform();
		a.click();
		/*List<WebElement> x = driver.findElements(By.tagName("iframe"));
		System.out.println(x.size());*/
		driver.close();
	

}}
