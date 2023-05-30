package com.Orange.HrmTest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.HrmBase.BaseClass;
import com.Orange.HrmPage.IndexPage;
import com.Orange.HrmPage.LoginPage;
import com.Orange.HrmPage.MyInfoPage;
import com.Orange.HrmPage.SystemUsersPage;

public class IndexPageTest extends BaseClass {
	SystemUsersPage systemUserPage;
	IndexPage indexPage;
	public String parentWin;
	LoginPage loginPage;
	

	
	@Test(priority=2)
	public void adminTabClick()
	{   indexPage=new IndexPage(driver);
	loginPage=new LoginPage(driver);
		indexPage=loginPage.loginMethod("Admin", "admin123");
		
		try
		{			
			systemUserPage=new IndexPage(driver).admin_Click();
			
			System.out.println("test2: I'm Passed");
			
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	String actual=BaseClass.driver.getCurrentUrl();
	String expected="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
	Assert.assertEquals(actual, expected);
	driver.navigate().back();
	}
	
	@Test
	public void orangeHrm_Logo()
	{ 
		
		loginPage=new LoginPage(driver);
		indexPage=loginPage.loginMethod("Admin", "admin123");
		indexPage=new IndexPage(driver);
	   	
	    boolean flag2=indexPage.orangehrm_Logo();
	    if(flag2==true)
	    {
		  System.out.println("OrangeHrm Logo is Visible");
	    }
	    else 
	    	System.out.println("rangeHrm Logo is not Visible");
		
	}
	
	@Test(priority=3)
	public void titleCheck()
	{   indexPage=new IndexPage(driver);
		String actualTitle=indexPage.title();
		System.out.println(actualTitle);
		String ExpectedTitle="OrangeHRM";
	    Assert.assertEquals(actualTitle, ExpectedTitle);	
	    System.out.println("test3 : passed");
	}
	
	@Test(priority=4)
	public void urlCheck()
	{   indexPage=new IndexPage(driver);
		String actualurl=new IndexPage(driver).url();
		System.out.println("url is : " +actualurl);	    
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(actualurl, expectedurl);
		System.out.println("test4 : passed");
	}
//	
//	@Test(priority=5)
//	public void navigating_myInfo() throws InterruptedException
//	{    indexPage=new IndexPage(driver);
//		 indexPage=loginPage.loginMethod("Admin", "admin123");	
//		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
//		 System.out.println("test5 passed");
//		 String actualUrl=driver.getCurrentUrl();
//		 String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7";
//		 Assert.assertEquals(actualUrl, expectedUrl, "navigating info is passed");
//		 String parentWin=driver.getWindowHandle();
//		// System.out.println(parentWin);
//	}

	
}
