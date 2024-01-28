package automationpractise2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationforwardback {

	public static void main(String[] args) throws InterruptedException {
		
		// selenium manager is on so e can skip system.set property line
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manav Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.cssSelector("path")).click();
		
//		Thread.sleep(3000);
//		
//        driver.navigate().to("https://rahulshettyacademy.com/");
//     
//       driver.navigate().back();
//       
//       Thread.sleep(3000);
//		
//         driver.navigate().forward();
         
        
        
        
		// TODO Auto-generated method stub

	}

}
