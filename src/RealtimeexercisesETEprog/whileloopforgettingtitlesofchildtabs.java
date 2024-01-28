package RealtimeexercisesETEprog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whileloopforgettingtitlesofchildtabs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.qaclickacademy.com/");
		
		WebElement footercolumn1 = driver.findElement(By.cssSelector(".footer-link.mt-40"));
	    WebElement footercolumn2 = driver.findElement(By.cssSelector(".footer-address.mt-40"));
	    
	    System.out.println(footercolumn1 .findElements(By.tagName("a")).size());
		System.out.println(footercolumn2 .findElements(By.tagName("a")).size());
	//	System.out.println(driver.findElement(By.cssSelector(".footer-address.mt-40")).getText());
		
		// click on each link in the column and check if pages are opening
		
				for(int i=1; i<footercolumn1 .findElements(By.tagName("a")).size(); i++)
				{
					String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					// the above is concept of keys in selenium to open in another tab, first  click on control 
				   //and enter
					
					footercolumn1.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
					Thread.sleep(3000);
				}// opens all the tabs
				
				
					Set<String> windows = driver.getWindowHandles();
					Iterator<String>it = windows.iterator();
				    
					while(it.hasNext())
					{
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
						
					}
				}
				
				
	}


