package seleniumAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRN {
	

		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.get("http://localhost/login.do");
			Thread.sleep(3000);
			Navigation nav = driver.navigate();
			nav.back();
			Thread.sleep(3000);
			nav.forward();
			Thread.sleep(3000);
			nav.refresh();
		}
}
