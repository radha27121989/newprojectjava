package DropDow;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		WebElement date = driver.findElement(By.xpath("(//td[@class='wd day'])[9]"));
			String text = date.getText();	
			System.out.println("date"+text);
			if(text.equals("13")) {
				System.out.println("date is present");
			}
			else {
				System.out.println("not present");
				
			}
		/*Select s = new Select(date);
		List<WebElement> mo1 = s.getOptions();
		for (WebElement x : mo1) {
			System.out.println(x.getText());

		}
*/
	}
}
