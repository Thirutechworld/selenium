package com.CommonBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import dSathyaUtil.SathyaUtil;

public class BaseClass 
{
 
	private static final String SathyaUtil = null;
	public static WebDriver driver;
	public static Properties prop;
	public static File src;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row0;
	public static XSSFRow row1;
	public static XSSFRow row2;
	public static XSSFRow row3;
	public static FileOutputStream fos;
	
	
	// Constructor to initialize the property file
	public BaseClass()
	{
		
		try {
			prop = new Properties();
			FileInputStream ip;
			ip = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SathyaProject\\src\\main\\java\\cSathyaConfig\\config.properties");
			prop.load(ip);
			}
		catch (IOException e) 
			{				
			e.printStackTrace();
			}	
	}

	// Launching Browser 
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Timeout is Defined in Util Class So That We Change Easily Without Disturb the Code
		//driver.manage().timeouts().pageLoadTimeout(com.sathyaUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(com.sathyautil.IMPLICT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}


	
}
