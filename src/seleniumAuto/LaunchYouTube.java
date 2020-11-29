package seleniumAuto;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchYouTube
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation files\\selenium-java-3.141.59\\Browse file\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}
	
}
