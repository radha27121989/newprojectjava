package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.toolsqa.com/");
	driver.manage().window().maximize();
	//WebElement enroll = driver.findElement(By.xpath("(//a[text()='Enroll Your Self'])[1]"));
	WebDriverWait wait=new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Enroll Your Self'])[1]"))).click();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//enroll.click();	
}
}
