package com.Mystore.testcases;



import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mystore.base.BaseClass;
import com.Mystore.pages.HomePage;
import com.Mystore.pages.IndexPage;
import com.Mystore.pages.LoginPage;
import com.Mystore.utilitys.Log;



public class LoginLPageTest extends BaseClass{

	IndexPage indexpage;
	LoginPage lp;
	HomePage hp;
	@BeforeMethod
	public void setup() throws IOException  {
		
		launchapp();
		
	}
	 @AfterMethod
	public void teardown() {
		driver.quit();
	}
	 
	 @Test
	 public void  login() throws Throwable {
		 Log.startTestCase("login");
		 indexpage=new IndexPage();
		 Log.info("click on singn in btn");
		 lp=indexpage.clickOnSignIn();
		 Log.info("enter user,password");
		 
		  hp= lp.Login(prop.getProperty("username"),prop.getProperty("password"));
		String actualurl=hp.getCurrenturl();
		Log.info("verify adim able to login");
	 Assert.assertEquals(actualurl, "http://automationpractice.com/index.php?controller=my-account");
	 Log.info("login sucess");
	Log.endTestCase("sucess")	;
		
		
	}
	@Test
	public void CrateAccount() throws Throwable {
		Log.startTestCase("CrateAccount");
		 indexpage=new IndexPage();
		 Log.info("click on singn in btn");
		lp= indexpage.clickOnSignIn();
		Log.info("enter email id");
		lp.CreateNewAccount("kotaiahdce@gmail.com");
		
		
	}
	
	
	

}
