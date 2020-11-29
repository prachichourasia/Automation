package seleniumAuto;

import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser 
{
public static void main(String[] args) 
{
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	Options opt=d.manage();
	opt.window().setSize(new Dimension(400,500));
	
}
}
