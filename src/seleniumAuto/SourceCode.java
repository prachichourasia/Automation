package seleniumAuto;

import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCode 
{
	public static void main(String[] args)
	{
		ChromeDriver d=new ChromeDriver();
		d.get("http://localhost/login.do");
		String sourceCode=d.getPageSource();
		System.out.println(sourceCode);
	}
}
