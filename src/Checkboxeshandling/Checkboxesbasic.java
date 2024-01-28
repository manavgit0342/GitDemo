package Checkboxeshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxesbasic {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		// check box below
	driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-zso239\"])[2]")).click();
	
	Thread.sleep(2400);

		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		
		
		
       Thread.sleep(2900);
        
        //int i =1;
        
//        while(i<4)
//        {
//       	driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//       	i++;
       	
//      }
       
       // also we can use for loop here
       
        for(int n=1; n<4; n++)
     {
    	 driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
     }
       
      
     Thread.sleep(2000);
       
     for(int o=0; o<3; o++)
       {
        	driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
       }
       
    driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n\"])[68]")).click();
    
    
      

        
     //   System.out.println(driver.findElement(By.xpath("//div[contains(text(),'4 Adults, 3 Children, 1 Infant')]")).getText());
	}
}

	
	


