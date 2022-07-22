package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class OrderPage extends BaseClass{
	
	Action action=new Action();
	
	@FindBy(xpath="//span[contains(text(),'$16.51')]")
	WebElement unitiPrice;
	
	@FindBy(xpath="//span[@id='total_price']")
	WebElement totalprice;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
	WebElement proceedtoCheckout;
	
	public  void OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() {
	String unitprice=	unitiPrice.getText();
	String unit=    unitprice.replaceAll("\"[^a-zA-Z0-9]\",\"\"","");
	double finaltotalprice=   Double.parseDouble(unit); 
	return finaltotalprice/100;
		}
	
	public double getTatolPrice() {
		String totalprice1=	totalprice.getText();
		String total=    totalprice1.replaceAll("\"[^a-zA-Z0-9]\",\"\"","");
		double finalprice=   Double.parseDouble(total); 
		return finalprice/100;
			}
public LoginPage ClickonProceedtoCheckout() {
	action.click(driver, proceedtoCheckout);
	return new LoginPage();
}

}
