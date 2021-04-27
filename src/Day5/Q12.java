package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions a = new Actions(driver);
		WebElement sig = driver.findElement(By.xpath("(//div[@class='xtXmba'])[9]"));
		a.moveToElement(sig).perform();
		WebElement toys = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(toys).perform();
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']")).click();

	}

}
