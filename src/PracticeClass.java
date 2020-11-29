import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumAuto.Url;

public class PracticeClass
{
	static FileInputStream fis;
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Frist try");
		fis =new FileInputStream("C:\\Users\\Ishan Ratnaparkhi\\Desktop\\Data.txt");
		Properties pobj=new Properties();
		pobj.load(fis);
		String s=pobj.getProperty("username");
		System.out.println(s);
		
		fis = new FileInputStream("D:\\Automation Files\\DDT\\TestScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String s1= book.getSheet("TestCaseData").getRow(1).getCell(1).getStringCellValue();
		System.out.println(s1);
		
		
		
	}
	
}

