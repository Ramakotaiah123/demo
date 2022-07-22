package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class OrdersummaryPage extends BaseClass {
	
	Action action=new Action();
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	WebElement confirmorder;
	
	public OrdersummaryPage() {
		PageFactory.initElements(driver, this);
	}

	public OrderConformationPage ConformOrder() {
		action.click(driver, confirmorder);
		return new OrderConformationPage();
	}
}
;