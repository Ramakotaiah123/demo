package com.Mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mystore.base.BaseClass;
import com.Mystore.pages.HomePage;
import com.Mystore.pages.IndexPage;
import com.Mystore.pages.LoginPage;

public class LoginLPageTest extends BaseClass{

	IndexPage indexpage;
	LoginPage lp;
	HomePage hp;
	@BeforeMethod
	public void setup() throws IOException {
		
		launchapp();
		
	}
	 @AfterMethod
	public void teardown() {
		driver.quit();
	}
	 
	 @Test
	 public void  login() throws Throwable {
		 
		 indexpage=new IndexPage();
		 lp=indexpage.clickOnSignIn();
		  hp= lp.Login(prop.getProperty("username"),prop.getProperty("password"));
		String actualurl=hp.getCurrenturl();
	 Assert.assertEquals(actualurl, "http://automationpractice.com/index.php?controller=my-account");
		
		Assert.assertEquals(actualurl, "http://automationpractice.com/index.php?controller=my-account");
		
	}
	@Test
	public void CrateAccount() throws Throwable {
		 indexpage=new IndexPage();
		lp= indexpage.clickOnSignIn();
		lp.CreateNewAccount("kotaiahdce@gmail.com");
		
		
	}
	
	
	

}
