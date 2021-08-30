package SeleniumHCLPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\DevOps Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Google...");
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//driver.close();

	}

}
