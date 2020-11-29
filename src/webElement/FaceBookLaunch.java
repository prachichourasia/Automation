package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLaunch 
{
	public static void main(String[] args) throws InterruptedException
	{	
		//1.launch browser
		WebDriver d=new ChromeDriver();
		//2.set path
		d.get("https://www.facebook.com/");
		//3.maximize browser
		d.manage().window().maximize();
		//4.enter email
		d.findElement(By.id("email")).sendKeys("prachichourasia14@gmail.com");
		//5.enter passward
		d.findElement(By.id("pass")).sendKeys("prachi@");
		//click on login button
		d.findElement(By.id("u_0_b")).click();
		//for fetching the home page title
		Thread.sleep(3000);
		//7.get title of current page
		String trueTitle=d.getTitle();
		System.out.println("True Title is = "+trueTitle);
		//8.type the expacted title
		String expTitle="Facebook";
		System.out.println("Expacted title is = "+expTitle);
		//9.validate by equals method
		String result=trueTitle.contains(expTitle)?"login valid":"login failed";
		System.out.println(result);
		//10.close browser
		//d.close();
	}
}
