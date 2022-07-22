package com.Mystore.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mystore.base.BaseClass;
import com.Mystore.pages.IndexPage;
import com.Mystore.pages.LoginPage;

public class IndexPageTest extends BaseClass
{
	
	IndexPage indexpage;
	LoginPage loginPage;
	
	@BeforeMethod
	  public void Setup() throws IOException {
		  
		  launchapp();
		  }
	
	@AfterMethod
  public void teradown() {
	  
	  driver.quit();
	  }
	@Test
	public void VerifyLog() throws Throwable {
		indexpage=new IndexPage();
	boolean result=	indexpage.validateLogo();
    Assert.assertTrue(result);
		
	}
	@Test
	public void VerifyTitle() {
	String acttitle=	indexpage.getMyStoreTitle();
	Assert.assertEquals(acttitle, "My Store");
	}
}
