package seleniumAuto;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFB 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation files\\selenium-java-3.141.59\\Browse file\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\Automation files\\selenium-java-3.141.59\\Browse file\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
	}
}
