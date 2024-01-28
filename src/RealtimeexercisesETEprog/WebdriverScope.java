package RealtimeexercisesETEprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScope {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qaclickacademy.com/");
		
		// finding count of all links on whole page.
	    System.out.println(driver.findElements(By.tagName("a")).size());
		
		// concept of limiting web driver scope as we are only finding count of links in footer section.
		WebElement footerdriver = driver.findElement(By.id("footer-part"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
      
		
		
	}

}
