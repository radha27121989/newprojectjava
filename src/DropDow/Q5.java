package DropDow;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.click();
		user.sendKeys("mages123");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.click();
		pass.sendKeys("malar123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(loc);
		List<WebElement> s1 = s.getOptions();
		for (WebElement x : s1) {
			if ((x.getText()).equalsIgnoreCase("London")) {
				x.click();
			}
		}
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select a = new Select(hotel);
		List<WebElement> ho = a.getOptions();
		for (WebElement y : ho) {
			if (y.getText().equalsIgnoreCase("Hotel Creek")) {
				y.click();
			}
		}

		Select v = new Select(driver.findElement(By.xpath("//select[@id='room_type']")));
		List<WebElement> u = v.getOptions();
		for (WebElement u1 : u) {
			if (u1.getText().equalsIgnoreCase("Double")) {
				u1.click();
			}

		}
		WebElement room1 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		// room1.click();
		Select o = new Select(room1);
		o.selectByIndex(2);
		WebElement room = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select p = new Select(room);
		p.selectByIndex(2);
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select k = new Select(child);
		k.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("radha");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("moha");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("valavanur");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567891011121");
		WebElement cctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select w = new Select(cctype);
		w.selectByIndex(2);
		WebElement exp = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select z = new Select(exp);
		z.selectByIndex(2);
		WebElement er = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select f = new Select(er);
		f.selectByIndex(12);
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.xpath("//input[@id='order_no']"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);

	}

}
