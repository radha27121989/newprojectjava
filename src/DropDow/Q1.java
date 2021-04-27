package DropDow;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement state = driver.findElement(By.xpath("//div[@id='state']"));
	//state.click();
		Select s = new Select(state);
		List<WebElement> s1 = s.getOptions();
		for (WebElement x : s1) {
			System.out.println(x.getText());
		}
		WebElement city = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
		 city.click();
		Select c1 = new Select(city);
		List<WebElement> city1 = c1.getOptions();
		for (WebElement x : city1) {
			System.out.println(x.getText());

		}

	}
}
