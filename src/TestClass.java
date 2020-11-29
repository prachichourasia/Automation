import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass
{
	

	public static void main(String[] args) {
		
	
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https:\\amazon.com");
	driver.findElement(By.id(""));
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement element=driver.findElement(By.id(""));
	wait.until(ExpectedConditions.visibilityOf(element));
	
	
	FluentWait wait1=new FluentWait(driver);
	wait1.pollingEvery(20,TimeUnit.SECONDS);
	wait1.withTimeout(20,TimeUnit.SECONDS);
	wait1.ignoring(NoSuchElementException.class);
	//wait1.until(ExpectedCondition);
	
	driver.switchTo().frame(2);
	
	String s=driver.getWindowHandle();
	driver.switchTo().window(s);
	Set<String> set=driver.getWindowHandles();
	Iterator it=set.iterator();
	
	Object child1=it.next();
	Object child2=it.next();
	
	WebElement lod=driver.findElement(By.id(""));
	Select s1=new Select(lod);
	s1.selectByIndex(1);
	
	
	
	}
}
