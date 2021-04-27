package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Chennai");
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Trichy");
		WebElement cale = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		cale.click();
		WebElement date = driver.findElement(By.xpath("(//td[@class='wd day'])[8]"));
		date.click();
		WebElement search = driver.findElement(By.xpath("//button[@class='fl button']"));
		search.click();
		

	}

}
