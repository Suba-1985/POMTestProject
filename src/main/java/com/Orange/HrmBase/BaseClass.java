package com.Orange.HrmBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Orange.HrmPage.LoginPage;
public class BaseClass{
	public static WebDriver driver;
    public  LoginPage loginPage;
	
	
  @BeforeMethod
	public void setup()
	{    
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    loginPage = new LoginPage(driver);
		
	}
	
//	@AfterMethod
//	public void tearDown() throws InterruptedException 
//	{	
//		Thread.sleep(3000);
//		driver.quit();
//	}

}


//package base;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import pages.HomePage;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class BaseTest {
//
//    private WebDriver driver;
//    protected HomePage homePage;
//
//    @BeforeMethod
//    @Parameters({"URL","browser"})
//    public void setUp(String URL, String browser){
//        if (browser.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//        else if (browser.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//        driver.manage().window().maximize();
//        driver.get(URL);
//        homePage = new HomePage(driver);
//    }
//
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
//}
//
