package com.auto.page;

import org.openqa.selenium.By;

public class masterDataManagement_page extends omniDashboard_page{
	public By genricMaster = By.xpath("//div[@title='Generic Master']");
	public By outletMaster = By.xpath("//div[@title='Outlet Masters']");
	public By warehouseMaster = By.xpath("//div[@title='Warehouse Masters']");
	
	public void masterData(String masterdata_type) {
		if(masterdata_type=="genericMaster") {
			clickButton(d, genricMaster);
		}else if (masterdata_type=="outletMaster") {
			clickButton(d, outletMaster);
		}else if (masterdata_type=="warehouseMaster") {
			clickButton(d, warehouseMaster);
		}
		
	}

}
