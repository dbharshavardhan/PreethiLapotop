package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlib {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		
	}

}
