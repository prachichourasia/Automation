package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		WebElement search=d.findElement(By.name("q"));
		search.sendKeys("msd");
		search.submit();
		
		d.navigate().to("https://www.gmail.com");
		d.findElement(By.linkText("Sign in")).click();
		d.findElement(By.id("identifierId")).sendKeys("prachichourasia14@gmail.com");
	}
}
