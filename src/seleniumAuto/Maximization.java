package seleniumAuto;

import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximization 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		//Options opt =driver.manage();
	//	Window win=opt.window();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
}
