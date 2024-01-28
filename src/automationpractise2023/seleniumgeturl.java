package automationpractise2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumgeturl {

	
		public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manav Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//chromedriver.exe -> chrome browser	
		
		
		//WebDriver driver = WebDriverManager.chromedriver().create();
			
		//	ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote--allow-origins=*");
			
			
			WebDriver driver = new ChromeDriver();
			//webdriver methods + class methods
			
			
			driver.manage().window().maximize();

			driver.get("https://rahulshettyacademy.com/");
					
		     System.out.println(driver.getTitle());
					
			driver.getCurrentUrl();					
					
			System.out.println(driver.getCurrentUrl());
					
			//driver.quit(); and driver.close(); ---- difference we should know					
					
					
					

		}

}
