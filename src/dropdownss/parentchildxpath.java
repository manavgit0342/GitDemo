package dropdownss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildxpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();
		
		//xpath by parent //child
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'Ahmedabad')]")).click();
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'Amritsar')]")).click();
		
		
		
		////div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'Amritsar')]
		//div[contains(text(),'Amritsar')]
	}

}
