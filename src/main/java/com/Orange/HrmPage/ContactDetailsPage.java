package com.Orange.HrmPage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Orange.HrmBase.BaseClass;

public class ContactDetailsPage extends BaseClass{
	

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//label[contains(text(),'Street 1')]/../../div[2]/input")
	WebElement street1_input ;
	@FindBy(xpath="//label[contains(text(),'Street 2')]/../../div[2]/input")
	WebElement street2;
	@FindBy(xpath="//label[contains(text(),'City')]/../../div[2]/input")
	WebElement city_input;
	@FindBy(xpath="//label[contains(text(),'State/Province')]/../../div[2]/input")
	WebElement state_input;
	@FindBy(xpath="//label[contains(text(),'Zip/Postal Code')]/../../div[2]/input")
	WebElement zipcode_input;
	@FindBy(xpath="//label[contains(text(),'Home')]/../../div[2]/input")
	WebElement phoneH_input;
	@FindBy(xpath="//*[@id=\"app\"]//div[6]/div/div[2]/div/div")
	WebElement country_input ;
	@FindBy(xpath="//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
	WebElement saveBtn;
	@FindBy(id="oxd-toaster_1")
	WebElement popup;
	
	

	public ContactDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);			
	}
	
	public void contactDetails_Entry() throws InterruptedException
	{   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		street1_input.clear();
		street1_input.sendKeys("aaaaa");
		Thread.sleep(3000);
	    street2.clear();
	    street2.sendKeys("aaaaa");
	
	    Thread.sleep(3000);
	    city_input.clear();
		city_input.sendKeys("aaaaaa");
		Thread.sleep(3000);
		state_input.clear();
		state_input.sendKeys("vaa state");
		Thread.sleep(3000);
		
		zipcode_input.clear();
		zipcode_input.sendKeys("345443");
		Thread.sleep(3000);
		saveBtn.click();
	}
	
	public boolean popup_chk()
	{
		popup.isDisplayed();
		return true;
	}
	

	
}
