package com.tnb.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textbox_username = By.xpath("//input[@name = 'username']");
	private final By textbox_password = By.xpath("//input[@name = 'password' and @type = 'password']");
	private final By btn_login = By.xpath("//button[@type = 'submit' and text() = ' Login ']");


	public OrangeHRMLoginPage enterUserName(String username) {
		sendkeys(textbox_username, username, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendkeys(textbox_password, password, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(btn_login, WaitStrategy.CLICKABLE);
		return new OrangeHRMHomePage();
	}
	

	public String getTitle() {
		return getPageTitle();
	}
}
