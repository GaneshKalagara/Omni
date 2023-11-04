package omini.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.auto.page.omniDashboard_page;

public class TestScript extends omniDashboard_page {
	
	@BeforeTest
	public void browserLanch() {
		browserLanch("http://101.53.158.27/OmniRetailer/");
	}
	@AfterTest
	public void appClose() {
		browserClose();
	}
	
	@Test(priority = 1)
	public void loginpage() throws InterruptedException {
		login("CID8995451", "venkat@test.com", "Password123#");
		//Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void omniPage() {
		pageVerify();
	}
	@Test(priority = 3)
	public void dList() {
		dashboard("profile");
		dashboard("masterData");
		dashboard("outlet");
		dashboard("warehouse");
		dashboard("procurement");
		dashboard("orderManagement");
		dashboard("campaignManagement");
		dashboard("customerLoyality");
		dashboard("customerRelationship");
		dashboard("financial");
		dashboard("payroll");
		dashboard("reports");
		dashboard("userAcess");
		dashboard("dataManagement");
		dashboard("systemLog");

	}
}
