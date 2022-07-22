package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class PaymentPage extends BaseClass{
	
	Action action=new Action();
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")
	WebElement paybybank;
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
	WebElement paybycheck;
	
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public OrdersummaryPage ClickonPaymenymethod() {
		action.click(driver, paybybank);
		return new OrdersummaryPage();
	}
	
}
