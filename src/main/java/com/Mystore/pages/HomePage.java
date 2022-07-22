package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class HomePage extends BaseClass {
	
	Action action=new Action();
	@FindBy(xpath="//span[contains(text(),'My wishlists')]")
	WebElement wishlists;
	
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	WebElement orderhistory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean vaildateingwishlist() {
		
		return action.isDisplayed(driver, wishlists);
	}
	
	public boolean vaildateingdorderlist() {
		
		return action.isDisplayed(driver, orderhistory);
	}

	
	
	
	
	
	
	
	
	
	
	
	public String getCurrenturl() {
		
		String HomePageurl=     driver.getCurrentUrl();
		return HomePageurl;
		
	}

}
