package RealtimeexercisesETEprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlinksinfootercolumns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qaclickacademy.com/");
		
       WebElement footercolumn1 = driver.findElement(By.cssSelector(".footer-link.mt-40"));
       WebElement footercolumn2 = driver.findElement(By.cssSelector(".footer-address.mt-40"));
		
		System.out.println(footercolumn1 .findElements(By.tagName("a")).size());
		System.out.println(footercolumn2 .findElements(By.tagName("a")).size());
	//	System.out.println(driver.findElement(By.cssSelector(".footer-address.mt-40")).getText());
		
		// click on each link in the column and check if pages are opening
		
		for(int i=0; i<footercolumn1 .findElements(By.tagName("a")).size(); i++)
		{
			footercolumn1.findElements(By.tagName("a")).get(i).click();
		}
		
		// to be continued in whileloopforgettingtitlesofchildtabs class.
		
		

	}

}
