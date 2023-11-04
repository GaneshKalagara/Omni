package com.auto.page;

import org.openqa.selenium.By;

public class omniDashboard_page extends login_page{
	public By Annapoorna = By.xpath("//span[text()='Annapoorna']");
	public By profileSettings = By.xpath("//li[@id='liSettings']/a");
	public By mData = By.xpath("//li[@id='liMasterDataManagement']");
	public By Outlet = By.xpath("//li[@id='storedetails']");
	public By warehouse = By.xpath("//li[@id='warehouseDetails']");
	public By procurement = By.xpath("//li[@id='liOutletProcurement']");
	public By orderManagement = By.xpath("//li[@id='liOrderManagementLi']");
	public By campaignManagement = By.xpath("//li[@id='deals-offers']");
	public By customerLoyality = By.xpath("//li[@id='customer-loyality']");
	public By customerRelationship = By.xpath("//li[@id='loyaltyProgram']");
	public By b2cManagement = By.xpath("//li[@id='lib2cConfig']");
	public By financialManagement = By.xpath("//li[@id='liAccountAccessControl']");
	public By payroll = By.xpath("//li[@id='payroleli']");
	public By report_analysis = By.xpath("//li[@id='reports']");
	public By userAccessControl = By.xpath("//li[@id='liUserAccessControl']");
	public By dataManagement = By.xpath("//li[@id='liDataManagement']");
	public By systemLog = By.xpath("//li[@id='liSystemLog']");
	
	public void pageVerify() {
		isdisplayed(d, Annapoorna);	
	}
	
	public void dashboard(String module) {
		if(module=="profile") {
			clickButton(d, profileSettings);
		}else if (module=="masterData") {
			clickButton(d, mData);
		}else if (module=="outlet") {
			clickButton(d, Outlet);
		}else if (module=="warehouse") {
			clickButton(d, warehouse);
		}else if (module=="procurement") {
			clickButton(d, procurement);
		}else if (module=="orderManagement") {
			clickButton(d, orderManagement);
		}else if (module=="campainManagement") {
			clickButton(d, campaignManagement);
		}else if (module=="customerLoyality") {
			clickButton(d, customerLoyality);
		}else if (module=="customerRelationship") {
			clickButton(d, customerRelationship);
		}else if (module=="b2c") {
			clickButton(d, b2cManagement);
		}else if (module=="financial") {
			clickButton(d, financialManagement);
		}else if (module=="payroll") {
			clickButton(d, payroll);
		}else if (module=="reports") {
			clickButton(d, report_analysis);
		}else if (module=="userAcess") {
			clickButton(d, userAccessControl);
		}else if (module=="dataManagement") {
			clickButton(d, dataManagement);
		}else if (module=="systemLog") {
			clickButton(d, systemLog);
		}
	}

}
