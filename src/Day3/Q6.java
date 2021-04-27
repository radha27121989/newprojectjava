package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	WebElement search = driver.findElement(By.xpath("//input[@title='From station']"));
	search.click();
	search.sendKeys("Trichy");
	WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
	to.click();
	to.sendKeys("Chennai");
	WebElement go = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	go.click();

}
}
