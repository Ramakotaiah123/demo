package com.Mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mystore.base.BaseClass;
import com.Mystore.pages.HomePage;
import com.Mystore.pages.IndexPage;
import com.Mystore.pages.LoginPage;
import com.Mystore.utilitys.Log;

public class HomePageTest extends BaseClass{
	
	
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
	
 public void Verifylists() throws Throwable {
	 
	 indexpage=new IndexPage();
	lp= indexpage.clickOnSignIn();
	hp=lp.Login(prop.getProperty("username"),prop.getProperty("password"));
	boolean result=hp.vaildateingwishlist();
	Assert.assertTrue(result);
	boolean result1=hp.vaildateingdorderlist();
	Assert.assertTrue(result1);
	 
 }
}
