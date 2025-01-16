package com.tmb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tnb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	
	private OrangeHRMTests() {}
	
	@Test
	public void loginLogoutTest() {
		
		String Title = new OrangeHRMLoginPage().enterUserName("Admin").enterPassword("admin123").clickLogin()
				.clickProfile().clickLogout()
				.getTitle();
		
		Assert.assertEquals(Title , "OrangeHRM");
	
	}

}
