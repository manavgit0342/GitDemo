package automationpractise2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorwait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manav Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
		
		driver.manage().window().maximize();
		
		
Thread.sleep(500);		
		
	//	driver.findElement(By.xpath("//input[@id='idToken1']")).sendKeys("dddd");
		
	//	driver.findElement(By.xpath("//input[@id='idToken2']")).sendKeys("23424");
		
		driver.findElement(By.className("btn btn-lg btn-block btn--primary")).click();
		
		
		
	
		
		

}

}