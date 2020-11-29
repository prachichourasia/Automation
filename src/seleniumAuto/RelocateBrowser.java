package seleniumAuto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
public class RelocateBrowser
{
	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.manage().window().setSize(new Dimension(500, 500));
		d.manage().window().setSize(new Dimension(0, 0));//SMALLEST size
		d.manage().window().setSize(new Dimension(-10, -90));// EXCEPTION
		
		d.manage().window().setPosition(new Point(10, 19));
		d.manage().window().setPosition(new Point(0, 0));//WORK FINE
		d.manage().window().setPosition(new Point(-10,-19));//WORK FINE
	}
}
