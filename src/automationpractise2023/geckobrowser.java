package automationpractise2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckobrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manav Sharma\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//webdriver methods + class methods
		
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/");
				
	     System.out.println(driver.getTitle());
				
		driver.getCurrentUrl();					
				
		System.out.println(driver.getCurrentUrl());

	}

}
