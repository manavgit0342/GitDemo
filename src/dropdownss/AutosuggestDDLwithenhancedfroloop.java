package dropdownss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDDLwithenhancedfroloop {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		
		Thread.sleep(2900);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		// now catch the above into one variable as list of web elements
		
		// our goal is to select India, so iterate through enhanced for loop
		
		for(WebElement option :options)
			
			// get me one option each time , so we will write like this -  option :options
			// so basically when loop iterates, u pick one options and that option will get stored in variable
			// option and return type pf that variable option is a web element---for(WebElement option :options)
			
		{
			
			if(option.getText().equalsIgnoreCase("India"))
					{
				
				option.click();
				break;
				
					}
			
			
     	}
		}
		
		
		
		

	}


