package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class ShippingPage extends BaseClass {
	
	Action action=new Action();
	@FindBy(xpath="//input[@id='cgv']")
	WebElement terams;
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]/i[1]")
	WebElement proceedtocheckbtn;
	
	public ShippingPage() {
		
		PageFactory.initElements(driver, this);
			}
	public void Checkonterams() {
		action.click(driver, terams);
	}
	public PaymentPage ClickonProceeshippingntn() {
		
		action.click(driver, proceedtocheckbtn);
		return new PaymentPage();
	}

}
