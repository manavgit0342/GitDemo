package dropdownss;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropDownwithIndexes {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		
		Thread.sleep(2900);
		driver.findElement(By.xpath("//div[contains(text(),'Ahmedabad')]")).click();
		
	     Thread.sleep(5000);
	     

	    driver.findElement(By.xpath("//div[contains(text(),'Ajmer')]")).click();
	     
	//dynamic drop down example below, if on both sides ajmer is present (from and to destination)
	    
	    
	    // driver.findElement(By.xpath("(//div[contains(text(),'Ajmer')])[1]")).click();
	     
	     
	     
	     
	    		 
	     
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
