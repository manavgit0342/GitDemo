package Checkboxeshandling;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	
	public class enabledisablewithattribute {

	

		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.spicejet.com/");
			
			System.out.println(driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[2]")).getAttribute("style"));
			
			driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
			
			System.out.println(driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[2]")).getAttribute("style"));
			
		if(driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[2]")).getAttribute("style").contains(" "));
		{
			System.out.println("not enabled");	
			Assert.assertTrue(driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[2]")).getAttribute("style").contains(" "));	
		}
	
	
			
		}
			
			

		




	}


