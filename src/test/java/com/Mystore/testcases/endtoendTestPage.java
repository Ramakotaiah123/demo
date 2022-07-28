package com.Mystore.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mystore.base.BaseClass;
import com.Mystore.pages.AddersPage;
import com.Mystore.pages.AddtoCartPage;
import com.Mystore.pages.IndexPage;
import com.Mystore.pages.LoginPage;
import com.Mystore.pages.OrderPage;
import com.Mystore.pages.SearchREsultPage;

public  class endtoendTestPage extends BaseClass {
	
	IndexPage ip;
	SearchREsultPage srp;
	AddtoCartPage acp;
	OrderPage op;
	LoginPage lp;
	AddersPage ap;
	@BeforeMethod
	public void setup() throws IOException {
		
		launchapp();
		
	}
	 @AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void compltetest() throws Throwable {
		
		ip=new IndexPage();
	srp=	ip.searchProduct("t shirt");
	acp=srp.ClickonProduct();
	 acp.EnterQuantity("1");
	 acp.EnterSize("S");
	  op= acp.ClickonProceedtoCheckbtn();
	// lp= op.ClickonProceedtoCheckout();
//	ap= lp.Login1(prop.getProperty("username"), prop.getProperty("password"));
//	ap.ClickonCheckoutbtn();
	
		
	}
	

}
