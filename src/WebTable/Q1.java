package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	List<WebElement> row = driver.findElements(By.tagName("tr"));
	for (int i = 0; i <row.size(); i++) {
		WebElement row1 = row.get(i);
		String text = row1.getText();
		/*System.out.println(text);
		System.out.println(i);*/
		List<WebElement> data = row1.findElements(By.tagName("td"));
		for (int j = 0; j <data.size(); j++) {
			WebElement data1 = data.get(j);
			String text1 = data1.getText();
			System.out.println(text1);
			System.out.println(i);
			System.out.println(j);

			
		}
		
	
	}
	
	
}
	
}
