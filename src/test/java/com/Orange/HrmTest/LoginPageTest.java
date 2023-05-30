package com.Orange.HrmTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.HrmBase.BaseClass;
import com.Orange.HrmPage.IndexPage;
import com.Orange.HrmPage.LoginPage;

public class LoginPageTest extends BaseClass{
     
	   IndexPage indexPage;
       LoginPage loginPage;
		 
	    @Test(priority=1)
		public void loginTest() throws InterruptedException
		{		
		try
		{
		loginPage=new LoginPage(driver);
		indexPage=loginPage.loginMethod("Admin","admin123");
		System.out.println("test1");
		}catch(Exception e)
		{
			System.out.println(e);
		}
      	 String actual=driver.getCurrentUrl();
		
		 String expected="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		 Assert.assertEquals(actual, expected);		
		}
}
