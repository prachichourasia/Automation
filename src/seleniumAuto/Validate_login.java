package seleniumAuto;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_login 
{
public static void main(String[] args) 
{
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.getTitle();
	String actualTitle=driver.getTitle();
	System.out.println("Actual title is : "+actualTitle);
	
	String expactedTitle="Facebook – log in or sign up";
	System.out.println("expactedTitle is : "+expactedTitle);
	
	/*if(actualTitle.equals(expactedTitle))
	{
		System.out.println("validation successful");
	}
	else
	{
		System.out.println("validation not successful");
	}*/
	String result = actualTitle.equals(expactedTitle) ? "validate successfully" :"not validate successfully";
	System.out.println(result);
	/*if(actualTitle.contains(expactedTitle))
	{
		System.out.println("validation successfully");
	}
	else
	{
		System.out.println("validation not successful");
	}
	if(actualTitle.equalsIgnoreCase(expactedTitle))
	{
		System.out.println("validation successfully");
	}
	else
	{
		System.out.println("validation not successful");
	}
	*/
	//5 close the browser
		driver.close(); 
	
}
}
