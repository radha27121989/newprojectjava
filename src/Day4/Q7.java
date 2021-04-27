package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("greens velmurugan"+Keys.ENTER);
	driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
}
	

}
