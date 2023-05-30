package com.Orange.HrmPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.HrmBase.BaseClass;


public class IndexPage extends BaseClass{

	WebDriver driver;
	
	
	
	@FindBy(xpath="class=\"oxd-topbar-header-breadcrumb\"")
	WebElement dashBoard;
	
	@FindBy(xpath="//a[@class=\"oxd-brand\"]")
	WebElement orangeHrm;
	
	@FindBy(xpath="//ul[@class=\"oxd-main-menu\"]//span[text()='Admin']")
	WebElement adminTab ;
	
	@FindBy(xpath="//span[text()='My Info']")
	WebElement myInfo;
	
	public IndexPage(WebDriver driver)
	{     this.driver=driver;
		  PageFactory.initElements(driver, this);
		 
	}
	
	public boolean orangehrm_Logo()
	{    
		boolean flag=orangeHrm.isDisplayed();
		System.out.println(flag);
		return true;
	}	
	public SystemUsersPage admin_Click()
	{
		adminTab.click();		
		return new SystemUsersPage(driver);
	}
	public String title()
	{   System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}
	public String url()
	{    System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	
	
	
	
}
