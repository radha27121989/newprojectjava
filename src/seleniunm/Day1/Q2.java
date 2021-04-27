package seleniunm.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");

	}

}
