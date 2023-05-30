package com.Orange.HrmPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.HrmBase.BaseClass;



public  class LoginPage extends BaseClass {
	WebDriver driver;
	
	@FindBy(id="welcome")
	WebElement welcomeUser;
 
	@FindBy(xpath="//input[@placeholder=\"Username\" and @name=\"username\"]")
	WebElement uName;
	
	@FindBy(xpath="//input[@placeholder=\"Password\" and @name=\"password\"]")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{  
	  PageFactory.initElements(driver, this);
	  
	 }
	
 
 
//This method will return object of HomePage class as we are landing on 
 //HomePage using this method
 public IndexPage loginMethod(String uname,String pswd) {
	
  uName.sendKeys(uname);
  pwd.sendKeys(pswd);
 
  loginBtn.click();
  return new IndexPage(driver);
 }
 
 
}


















//package com.Orange.HrmPage;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.Orange.HrmBase.BaseClass;
//
//public class LoginPage extends BaseClass {	
//	
//	
//	@FindBy(xpath="//input[@class=\"oxd-input oxd-input--active\" and @name=\"username\"]")
//	WebElement uName;
//	
//	@FindBy(xpath="//input[@class=\"oxd-input oxd-input--active\" and @name=\"password\"]")
//	WebElement pwd;
//	
//	@FindBy(xpath="//button[@type=\"submit\"]")
//	WebElement loginBtn;
//	
//	public LoginPage()
//	{
//		PageFactory.initElements(driver, BaseClass.class);		
//	}
//	
//	public String validateLoginPageTitle () {
//        return driver.getTitle();
//	}
//	
//	public IndexPage loginMethod(String userName, String password)
//	{
//		uName.sendKeys(userName);
//		pwd.sendKeys(password);
//		loginBtn.click();
//		return new IndexPage();
//	}
//
//}
