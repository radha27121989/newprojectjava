package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("radha");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("mohan");
		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("chennai");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("radhmoha@gmail.com");
		WebElement phono = driver.findElement(By.xpath("//input[@type='tel']"));
		phono.sendKeys("9952128765");
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement hobby = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobby.click();
		/*
		 * WebElement languages = driver.findElement(By.xpath("//div[@id='msdd']"));
		 * languages.sendKeys("tamil");
		 */
		/*
		 * WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		 * skills.click().+Keys.ARROW_DOWN;
		 */
		WebElement firstpass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		firstpass.sendKeys("1234");
		WebElement secpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		secpass.sendKeys("12345");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();

	}

}
