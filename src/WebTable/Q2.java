package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	List<WebElement> row = driver.findElements(By.tagName("tr"));
	for (int i = 0; i <1; i++) {
		WebElement data = row.get(i);
		System.out.println(data.getText());
		
	}
}
	

}
