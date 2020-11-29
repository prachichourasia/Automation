package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiElementValidation 
{


	public static void main(String[] args) throws InterruptedException
	{	
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://localhost/login.do");
		
		d.manage().window().maximize();
		
		d.findElement(By.id("username")).sendKeys("admin");
		
		d.findElement(By.name("pwd")).sendKeys("manager");
		
		d.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
	
		String trueTitle=d.getTitle();
		System.out.println("True Title is = "+trueTitle);
		String expTitle="actiTIME - Enter Time-Track";
		System.out.println("Expacted title is = "+expTitle);
		String result=trueTitle.contains(expTitle)?"login valid":"login failed";
		System.out.println(result);
		
		d.findElement(By.linkText("Tasks")).click();
		Thread.sleep(3000);
		String actualText1=d.findElement(By.className("pagetitle")).getText();
		System.out.println("actualText = "+actualText1);
		String result1=actualText1.equals("Open Tasks")?"Pass":"Fail";
		System.out.println(result1);
		
		d.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
		String actualText2=d.findElement(By.linkText("Saved Reports")).getText();
		System.out.println("actualText2 = "+actualText2);
		String result2=actualText2.equals("Saved Reports")?"Pass":"Fail";
		System.out.println(result2);
		
		d.findElement(By.linkText("Users")).click();
		Thread.sleep(3000);
		String actualText3=d.findElement(By.className("textTitle")).getText();
		System.out.println("actualText3 = "+actualText3);
		String result3=actualText3.equals("User List")?"Pass":"Fail";
		System.out.println(result3);
		
		d.findElement(By.linkText("Work Schedule")).click();
		Thread.sleep(3000);
		String actualText4=d.findElement(By.className("pagetitle")).getText();
		System.out.println("actualText4 = "+actualText4);
		String result4=actualText4.equals("Corporate Schedule")?"Pass":"Fail";
		System.out.println(result4);
		
		d.findElement(By.linkText("Notifications")).click();
		Thread.sleep(3000);
		String actualText5=d.findElement(By.className("pagetitle")).getText();
		System.out.println("actualText5 = "+actualText5);
		String result5=actualText5.equals("Email Notifications")?"Pass":"Fail";
		System.out.println(result5);
		
		d.findElement(By.linkText("Time-Track")).click();
		Thread.sleep(3000);
		String actualText6=d.findElement(By.className("pagetitle")).getText();
		System.out.println("actualText6 = "+actualText6);
		String result6=actualText6.equals("Enter Time-Track")?"Pass":"Fail";
		System.out.println(result6);
		
		d.close();
	}
}
