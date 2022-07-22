package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class AccountCreatePage extends BaseClass {
	
	Action action=new Action();
	
	@FindBy(xpath="//h1[contains(text(),'Create an account')]")
	WebElement formtitle;
	
	public AccountCreatePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validatingform() {
		action.isDisplayed(driver, formtitle);
		
	}
	
	
	
	
	

}
