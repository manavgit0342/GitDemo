package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
	    
	    
	     
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		//capital letters for send keys and double click also
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("watch").doubleClick().build().perform();
		
		
		Thread.sleep(3000);
		// move to a specific element
		// also right click on it
		a.moveToElement(move).contextClick().build().perform(); 
		
		
		
		
		
		
		
		
		

	}

}
