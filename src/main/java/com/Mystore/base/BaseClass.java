package com.Mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.ietf.jgss.Oid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Mystore.action.Action;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Hitendra: BaseClass is used to load the config file and Initialize 
 * WebDriver
 *  
 */
public class BaseClass {
		public static WebDriver driver;
	public static Properties prop;
	@BeforeTest
	public void loadconfig() throws IOException {
		
		try {
			FileInputStream fi=new FileInputStream(System.getProperty("user.dir") + "\\configuration\\conifg.properties");
			prop=new Properties();
			prop.load(fi);
		   System.out.println("driver is"+driver);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void launchapp() throws IOException {
		
		loadconfig();
		Action action=new Action();

		
		WebDriverManager.chromedriver().setup();
	String browsername=	 prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("Chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();

	}
	else if(browsername.equalsIgnoreCase("ie")) {
		WebDriverManager.chromedriver().setup();
		driver=new InternetExplorerDriver();
	}
  driver.manage().window().maximize();
  action.implicitWait(driver, 10);
  action.pageLoadTimeOut(driver, 30);
  driver.get(prop.getProperty("url"));
	
		
		
		
		
		
	}

	
	
	
	
	
}





