package Windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlesprog {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
	    Set<String> windows = driver.getWindowHandles(); // these two windows[parentid,childid] are sitting in object -windows]
	    
	    Iterator<String>it = windows.iterator();
	    
	    //now our goal is to pull the [parentid,childid] from set data structure using windows.iterator
	    // it variable will go and extract the values present in set collection.
	    
	    String parentID = it.next();
	    
	     // control will go to 0th index where parent id is present, it will grab it
	    //now if u want child, do one more next and control will go from o to 1st index
	    
	    String childID = it.next();
	    driver.switchTo().window(childID);
	    
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    
	    driver.findElement(By.cssSelector(".im-para.red")).getText();
	    // put a breakpoint and debug it, then click on watch
	    
	    String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    
	    driver.switchTo().window(parentID);
	    driver.findElement(By.id("username")).sendKeys(emailID);
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

}
