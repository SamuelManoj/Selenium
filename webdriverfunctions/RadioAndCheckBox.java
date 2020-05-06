package webdriverfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 

		WebElement radio = driver.findElement(By.id("u_0_6"));
		radio.click();
		
		if (radio.isSelected()) {					
            System.out.println("Radio button is selected");					
        } else {			
            System.out.println("Radio button is not selected");					
        }	
	}
}
