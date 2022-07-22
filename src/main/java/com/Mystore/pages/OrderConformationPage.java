package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class OrderConformationPage extends BaseClass {
	
	Action action=new Action();
	
	@FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
	WebElement OrderConform;
	
	public OrderConformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidteOrderConform() {
		
	String confirmMsg=	OrderConform.getText();
	return confirmMsg;
		
	}

}
