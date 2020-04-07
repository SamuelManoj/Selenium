package webdriverfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSubmit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/login.html");
		
		WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("passwd"));
        
        email.sendKeys("Samuel_Manoj@Outlook.com");					
        password.sendKeys("12345");
        System.out.println("Text Field Set");					

        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");

        email.sendKeys("Samuel_Manoj@Outlook.com");					
        password.sendKeys("12345");
        driver.findElement(By.id("SubmitLogin")).click();
        System.out.println("Login Done with Click");					

		driver.get("http://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("Samuel_Manoj@Outlook.com");							
        driver.findElement(By.name("passwd")).sendKeys("12345");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");
        
       driver.close();
	}
}
