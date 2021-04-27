package Day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a = new Actions(driver);
		WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		a.moveToElement(home).perform();
		driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement name = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		String text = name.getText();
		System.out.println(text);

	}

}
