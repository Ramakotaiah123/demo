package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class SearchREsultPage extends BaseClass{
	
	Action action=new Action();
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement  Productresult;
	
	public SearchREsultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean IsProduceAvabile() {
		return action.isDisplayed(driver, Productresult);
		}
	
  public AddtoCartPage ClickonProduct() {
	  
	  action.click(driver, Productresult);
	  return new AddtoCartPage();
	  
}
  
  
  
}


