package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp 
{
public static void main(String[] args) 
{
	//step 1 :launch the browser
	WebDriver driver=new ChromeDriver();
	
	//step 2 :provide path open application
	driver.get("http://localhost/login.do");
	
	//step 3 :maximize browser
	driver.manage().window().maximize();
	
	//step 4 :fetch the place through by class locator
	By unlocation =By.id("username");
	
	//capture the element
	//driver.findElement(unlocation);
	
	//store in webelemnt refrence(becoz we want to perform action)
	WebElement username=driver.findElement(unlocation);
	
	//step 7 :enter username(perform action)
	username.sendKeys("admin");
	
	
	By pwdlocation=By.name("pwd");
	WebElement passward=driver.findElement(pwdlocation);
	passward.sendKeys("manager");
	
	By lgnbutton=By.id("loginButton");
	WebElement lb=driver.findElement(lgnbutton);
	lb.click();
	
}
}
