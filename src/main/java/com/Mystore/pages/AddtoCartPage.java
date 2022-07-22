package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class AddtoCartPage extends BaseClass {
	
	
	Action action=new Action();
	@FindBy(xpath="//input[@id='quantity_wanted']")
	WebElement quatity;
	
	@FindBy(xpath="//select[@id='group_1']")
	WebElement size;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement AddtoCartbtn;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
	WebElement AddtoCartMassage;
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]")
	WebElement ProceedtoChechbtn;
	
	public AddtoCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void EnterQuantity(String quantity1) {
		action.type(quatity, quantity1);
	}
   public void EnterSize(String size1) {
	   action.selectByVisibleText(size, size1);
   }
   public void ClickonAddtoCartbtn() {
	   action.click(driver, AddtoCartbtn);
   }
   
   public boolean VaildAddtocartMassage() {
	  return action.isDisplayed(driver, AddtoCartMassage);
   }
   
   public OrderPage ClickonProceedtoCheckbtn() throws Exception {
	   action.JSClick(driver, ProceedtoChechbtn);
	   return new OrderPage();
   }
   
   
}
