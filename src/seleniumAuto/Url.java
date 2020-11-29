package seleniumAuto;

import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	//getting current url of the page
	public static void main(String[] args)
	{
		ChromeDriver d=new ChromeDriver();
		d.get("http://localhost/login.do");
		String currentURL=d.getCurrentUrl();
		System.out.println(currentURL);
		
		d.get("http://facebook.com");
		String currentURL2=d.getCurrentUrl();
		System.out.println(currentURL2);
		d.close();
		d.get("https://www.facebook.com/");
	}

}
