package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateCompareButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
        d.findElement(By.xpath("//button[.='✕']")).click();
		
         d.findElement(By.name("q")).sendKeys("iphone");
		
		d.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		
		String xpath="//div[text()='Apple iPhone SE (Red, 64 GB)']/../../..//span[.='Add to Compare']";
		
		WebElement we= d.findElement(By.xpath(xpath));
		we.click();
		Thread.sleep(3000);
		
		String actualString=d.findElement(By.xpath("//span[.='COMPARE']")).getText();
		System.out.println(actualString);
		String expactedString="COMPARE";
		String result=actualString.equals(expactedString)?"Compare Button Present":"Compare Button not Present";
		System.out.println(result);
		d.close();
	}
}
