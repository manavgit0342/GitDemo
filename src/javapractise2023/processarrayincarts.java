package javapractise2023;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class processarrayincarts {

	

	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
				
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		String[] itemsNeeded = {"Brocolli","Cucumber","Beetroot"};
		
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
	 int j=0;
		for(int k=0; k<products.size(); k++);
		
		{
			
			String[] name = products.get(k).getText().split("-");
			String formattedname = name[0].trim();
			
			// check whether name you extracted is present in array or not
			// convert array to array list for easy search
			
			List itemsneededlist = Arrays.asList(itemsNeeded);
			
			if(itemsneededlist.contains(formattedname)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(k).click();
				
				if(j==itemsNeeded.length)
				{ 
				   return;
				}
					
			}
		}
		
		
		
	}

}
