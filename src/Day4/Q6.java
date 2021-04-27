package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("radha");
		System.out.println(email.getAttribute("value"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("1234");
		System.out.println(pass.getAttribute("value"));
		driver.close();

	}

}
