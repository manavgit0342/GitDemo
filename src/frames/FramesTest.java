package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2900);
		
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
	//	driver.switchTo().frame(0); we can also use it with index
		
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
	    a.dragAndDrop(source, target).build().perform();
	    driver.switchTo().defaultContent();
	    // if u want to come out of frames
		
	}

}
