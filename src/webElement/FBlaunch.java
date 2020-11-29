package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlaunch 
{
	public static void main(String[] args)
	{
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		By unlocation =By.name("inputtext login_form_input_box");
		WebElement username=d.findElement(unlocation);
		username.sendKeys("prachichourasia14@gmail.com");
		
		By pwlocation=By.id("pass");
		WebElement passward=d.findElement(pwlocation);
		passward.sendKeys("prachi@#1992");
		
		By login=By.id("u_0_b");
		WebElement Button=d.findElement(login);
		Button.click();
		
	}

}
