package Day8alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(5000);
		WebElement t = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		t.click();
		driver.switchTo().alert().accept();



}}
