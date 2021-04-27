package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
	Actions a = new Actions(driver);
	a.moveToElement(course).perform();
	WebElement data = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
	a.moveToElement(data).perform();
	driver.findElement(By.xpath("//span[text()='Talend Certification Training']")).click();

	


}
	

}
