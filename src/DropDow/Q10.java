package DropDow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q10 {
public static void main(String[] args) {
	int count=0;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://output.jsbin.com/osebed/2");
	WebElement fruits = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
	Select s = new Select(fruits);
	List<WebElement> d = s.getOptions();
for (int i = 0; i < d.size(); i++) {
	if(i%2==0) {
		s.selectByIndex(i);
	}
	else {
		count++;
	}
	
}
System.out.println(count);
	

}
	
}
