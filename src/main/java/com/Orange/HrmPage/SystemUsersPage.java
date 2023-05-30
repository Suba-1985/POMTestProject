package com.Orange.HrmPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.HrmBase.BaseClass;

public class SystemUsersPage extends BaseClass{
	
	@FindBy(xpath="//form[@class=\"oxd-form\"]//input[@class=\"oxd-input oxd-input--active\"]")
	WebElement uName;
	
	@FindBy(xpath="//div[contains(@class,'oxd-select-text oxd-select-text--active')][1]")
	WebElement userRole;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")
	WebElement emp_Name;
	
	@FindBy(xpath="")
	WebElement df;
	

	public SystemUsersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
