package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("redmi");
	driver.findElement(By.xpath("//a[@class='srch_action btn orange']")).click();
	driver.findElement(By.xpath("(//div[@class='img_section'])[1]")).click();
	
}
	

}
