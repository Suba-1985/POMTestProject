package com.Orange.HrmPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.HrmBase.BaseClass;

public class MyInfoPage extends BaseClass{
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact Details']")
	WebElement contactDetails;
	
//	@FindBy(xpath="//label[text()='Street 2']")
//	WebElement street2;
//	
//	@FindBy(xpath="//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
//	WebElement saveBtn;
	
	
	
	public MyInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

	
	public ContactDetailsPage contact_detailsClick()
	{
		contactDetails.click();
		return new ContactDetailsPage(driver);
		
	}

}
