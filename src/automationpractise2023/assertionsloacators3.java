package automationpractise2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertionsloacators3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manav Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	   driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()  , "Hello rahul"+",");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
	   
	   
		
		
		

	}

}
