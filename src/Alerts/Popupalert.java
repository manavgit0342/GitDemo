package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupalert {

	public static void main(String[] args) throws InterruptedException {
		
		String text = "manav bhai";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2900);
		driver.findElement(By.cssSelector("input[id=\"alertbtn\"]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2990);
		driver.findElement(By.cssSelector("input[id=\"confirmbtn\"]")).click();
		Thread.sleep(2990);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		}
		
		
		
		
		
		
		
		
		
		

	}


