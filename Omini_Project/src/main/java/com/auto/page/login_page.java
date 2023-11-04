package com.auto.page;

import org.openqa.selenium.By;

import com.auto.common.GenericMethods;

public class login_page extends GenericMethods{
	public By customerId= By.id("userId");
	public By userId = By.xpath("//input[@id='emailId']");
	public By password = By.xpath("//input[@id='password']");
	public By login = By.xpath("//button[text()='Login']");
	public By logo = By.xpath("//img[@src='/OmniRetailer/images/Product_Logo.png']");
	
	public void login(String CID, String UID, String pass) throws InterruptedException {
		isdisplayed(d, logo);
		Sendkeys(d, customerId, CID);
		Sendkeys(d, userId, UID);
		Sendkeys(d, password, pass);
		Thread.sleep(20000);
		clickButton(d, login);
		
	}
}
