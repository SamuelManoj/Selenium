package webdriverfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePageTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://www.facebook.com";
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = "";

		// launch demo site using chrome browser
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!"); 
		} 
		else {
			System.out.println("Test Failed"); 
		}
		 
		driver.close();
	}
}
