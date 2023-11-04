package omini.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auto.page.masterDataManagement_page;

public class genricMasterTest extends masterDataManagement_page{
	
	@BeforeTest
	public void browserLanch() throws InterruptedException {
		browserLanch("http://101.53.158.27/OmniRetailer/");
		login("CID8995451", "venkat@test.com", "Password123#");
		pageVerify();
	}
	@AfterTest
	public void appClose() {
		//browserClose();
	}
	
	
	@Test(priority = 1)
	public void omniPage() throws InterruptedException {
		dashboard("masterData");
		masterData("genricMaster");
		Thread.sleep(5000);
	}
		
}
