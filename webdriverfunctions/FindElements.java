package webdriverfunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		List<WebElement> element = driver.findElements(By.name("facebook"));
		
		System.out.println("number of elements : " + element.size());
		
		for(int i = 0; i< element.size();i++) {
			System.out.println("Element list is " + element.get(i).getAttribute("value"));
		}
		driver.quit();
	}
}
