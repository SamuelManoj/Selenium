package webdriverfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	
	public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
        String baseUrl = "http://demo.guru99.com/test/link.html";									
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("click")).click();					
        System.out.println("Page title is: " + driver.getTitle());							
        driver.quit();			
    }		

}
