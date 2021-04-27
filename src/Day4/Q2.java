package Day4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@title='Trainer']")).click();
	WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan curre')]"));
String text2 = text.getText();
System.out.println(text2);
}
	

}
