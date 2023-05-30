package com.Orange.HrmTest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.HrmBase.BaseClass;
import com.Orange.HrmPage.ContactDetailsPage;
import com.Orange.HrmPage.IndexPage;
import com.Orange.HrmPage.LoginPage;
import com.Orange.HrmPage.MyInfoPage;

public class ContactDetailsPageTest extends BaseClass{
	IndexPage indexPage;
	public String parentWin;
	MyInfoPage myInfoPage;
	ContactDetailsPage contactDetailsPage;
	LoginPage loginPage;
	Set<String> childWin;
	@Test(priority=1)
	public void contact_Entry() throws InterruptedException
	{
		loginPage=new LoginPage(driver);
		loginPage.loginMethod("Admin", "admin123");
		System.out.println("Successful login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		System.out.println("index page");
		myInfoPage=new MyInfoPage(driver);		
		contactDetailsPage=myInfoPage.contact_detailsClick();
		System.out.println("COntacts page");
		contactDetailsPage=new ContactDetailsPage(driver);	
		contactDetailsPage.contactDetails_Entry();
		Thread.sleep(3000);
		System.out.println("Entering contacts details and saving");		
		driver.navigate().back();	
		System.out.println("navigating back to index page");
		
	}
	
	@Test(priority=2)
	public void pop_up()
	{
		boolean flag=contactDetailsPage.popup_chk();
		Assert.assertTrue(flag);
	}
	
	
	
}
