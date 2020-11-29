package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sidharth 
{
public static void main(String[] args) throws InterruptedException {
		
		int count = 0;
		WebDriver driver = new ChromeDriver();
		System.out.println(++count+".Browser Opened.");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		System.out.println(++count+".Flipkart Website Opened.");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		
		String item = "iphone";
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(item);
		System.out.println(++count+".Search \""+item+"\".");
		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
		search.submit();
		Thread.sleep(3000);
		
		/*String checkbox = "//div[text()='Apple iPhone XR (White, 64 GB)']/../../../div/div[2]//input[@type='checkbox']";
		driver.findElement(By.xpath(checkbox)).click();
		System.out.println(++count+".CheckBox Selected.");
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Red, 64 GB)']/../../..//span[.='Add to Compare']")).click();
		
		String compare = driver.findElement(By.xpath("//span[text()='COMPARE']")).getText();
		compare = compare.equals("COMPARE")?"COMPARE Element is Visible.":"COMPARE Element is NOT Visible.";
		System.out.println(compare);
		
		driver.close();
		
		
		
		/*public class FlipKartDealOfTheDay 
		{

			public static void main(String[] args) throws InterruptedException 
			{
				WebDriver d=new ChromeDriver();
				d.get("https://www.flipkart.com/");
				
				d.manage().window().maximize();
				Thread.sleep(2000);
				
		        d.findElement(By.xpath("//button[.='✕']")).click();
				
				String DODD=d.findElement(By.xpath("//h2[.='Deals of the Day']/..//span")).getText();
				System.out.println("Deal of the Day Time is "+DODD);
//			}
		//



		*/
	}

}
