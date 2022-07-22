package com.Mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.action.Action;
import com.Mystore.base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	Action action=new Action();
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submitbtn;
	
	@FindBy(id="email_create")
	WebElement emailForNewAccount;
	
	@FindBy(id="SubmitCreate")
	WebElement CreateNewAccountBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public HomePage Login(String usr,String pws) {
	//	action.fluentWait(driver, LoginPage, 10);
		action.type(email,usr);
		action.type(password, pws);
		action.click(driver, submitbtn);
		return new HomePage();
		}
	
	public AddersPage Login1(String usr,String pws) {
		//	action.fluentWait(driver, LoginPage, 10);
			action.type(email,usr);
			action.type(password, pws);
			action.click(driver, submitbtn);
			return new AddersPage();
			}
		
	
	public AccountCreatePage CreateNewAccount(String Newemail) {
		action.type(emailForNewAccount,"kotaiahdce@gmail.com");
		action.click(driver, CreateNewAccountBtn);
		return  new AccountCreatePage();
		
	}
	
		
		
	
	
	

}
 