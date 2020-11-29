package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		
		d.get("http://localhost/login.do");
		
		d.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("admin");
		d.findElement(By.cssSelector(".initial")).click();
		Thread.sleep(3000);
		WebElement errorMsg =d.findElement(By.className("errormsg"));
		String actualError=errorMsg.getText();
		System.out.println(actualError);
		
}



}