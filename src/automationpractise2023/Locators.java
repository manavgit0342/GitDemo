package automationpractise2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manav Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("manavawasthy94@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lenovodell@#$");
	
	}

}
