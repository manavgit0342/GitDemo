package dropdownss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DDprogramselecttag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// dropdown with select tag
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// create a class called select with an object
		
		Select dropdown1 = new Select(staticdropdown);
		
		dropdown1.selectByIndex(2);
		
		//dropdown1.getFirstSelectedOption().getText();
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		
		dropdown1.selectByValue("USD");
		
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		
		dropdown1.deselectByVisibleText("INR");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		
		
	}

}
 