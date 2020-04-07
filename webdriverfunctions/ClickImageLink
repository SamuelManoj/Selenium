package webdriverfunctions;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class ClickImageLink {				
    		
    public static void main(String[] args) {									
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();					

		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
		
		driver.close();		
    }		
}
