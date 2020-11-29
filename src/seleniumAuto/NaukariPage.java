package seleniumAuto;

import org.openqa.selenium.chrome.ChromeDriver;
//child windows opening
public class NaukariPage 
{
public static void main(String[] args)
{
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.naukri.com/");
//	d.close();//only main tab is closing
	d.quit();//quit close all the windows are getting close
}
}
