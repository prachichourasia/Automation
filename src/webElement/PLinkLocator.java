package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PLinkLocator 
{
	public static void main(String[] args)
	{
WebDriver d=new ChromeDriver();
		
		d.get("file:///D:/html%20folder/link.html");
		
		d.manage().window().maximize();
		
		d.findElement(By.partialLinkText("ACi")).click();
		d.findElement(By.partialLinkText("aCi")).click();
		d.findElement(By.partialLinkText(" Ci")).click();
		d.findElement(By.partialLinkText("Ai")).click();
	}
}
