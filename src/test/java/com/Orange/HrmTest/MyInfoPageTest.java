package com.Orange.HrmTest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.HrmBase.BaseClass;
import com.Orange.HrmPage.ContactDetailsPage;
import com.Orange.HrmPage.IndexPage;
import com.Orange.HrmPage.LoginPage;
import com.Orange.HrmPage.MyInfoPage;

public class MyInfoPageTest extends BaseClass{

	IndexPage indexPage;
	public String parentWin;
	MyInfoPage myInfoPage;
	ContactDetailsPage contactDetailsPage;
	LoginPage loginPage;
	Set<String> childWin;
	
	@Test(priority=5)	
	public void myInfoTest()
	{    
		 loginPage=new LoginPage(driver);
	     indexPage=loginPage.loginMethod("Admin", "admin123");
	     indexPage=new IndexPage(driver);
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		 System.out.println("test5 passed");
		 String actualUrl=driver.getCurrentUrl();
		 String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7";
		 Assert.assertEquals(actualUrl, expectedUrl, "navigating info is passed");
		 String parentWin=driver.getWindowHandle();	
		 
	}
	@Test(priority=6)
	public void contactDetailsClick()
	{
		
		loginPage=new LoginPage(driver);
		indexPage=loginPage.loginMethod("Admin", "admin123");
		indexPage=new IndexPage(driver);
		myInfoPage=new MyInfoPage(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
	    
		contactDetailsPage=myInfoPage.contact_detailsClick();
		contactDetailsPage=new ContactDetailsPage(driver);	
	    childWin=driver.getWindowHandles();
	}
	 
}
