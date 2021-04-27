package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]")).click();
driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]")).click();

}
}
