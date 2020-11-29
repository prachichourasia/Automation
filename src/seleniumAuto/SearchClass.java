
package seleniumAuto;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchClass 
{
	public static void main(String[] args)
	{
		SearchContext d=new ChromeDriver();
		/*d.get("https://www.naukri.com/");     these are searchcontext methdo so becoz of upcasting it is giving error
		d.close();//only main tab is closing
		d.quit();//quit close all the windows are getting close
*/	}
}
