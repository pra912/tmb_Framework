package com.tnb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage{
	
	private final By link_profile = By.xpath("//i[contains(@class, 'userdropdown-icon')]");
	private final By link_logout = By.xpath("//a[@role = 'menuitem' and text() = 'Logout']");
	
	public OrangeHRMHomePage clickProfile() {
		click(link_profile, WaitStrategy.PRESENCE);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(link_logout, WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}

}
