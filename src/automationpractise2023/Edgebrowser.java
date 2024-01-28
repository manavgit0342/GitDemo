package automationpractise2023;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgebrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Manav Sharma\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//chromedriver.exe -> chrome browser	
		
		
		WebDriver driver = WebDriverManager.edgedriver().create();
			
		//	ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote--allow-origins=*");
			
			
		//	WebDriver driver = new EdgeDriver();
			//webdriver methods + class methods
			
			
			driver.manage().window().maximize();

			driver.get("https://rahulshettyacademy.com/");
					
		     System.out.println(driver.getTitle());
					
			//driver.getCurrentUrl();					
					
			System.out.println(driver.getCurrentUrl());
					
			///driver.quit(); and driver.close(); ---- difference we should know	

	}

}
