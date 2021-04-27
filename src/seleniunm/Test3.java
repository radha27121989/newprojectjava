package seleniunm;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/");
WebElement checkboxclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
checkboxclose.click();


WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
search.sendKeys("iphonex"+Keys.ENTER);
WebElement f = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
f.click();

}


}
	


