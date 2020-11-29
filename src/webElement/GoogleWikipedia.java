package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWikipedia {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		WebElement search=d.findElement(By.name("q"));
		search.sendKeys("msd");
		search.submit();
		
		d.findElement(By.xpath("//h3[.='MSD - Wikipedia']")).click();


	}

}
