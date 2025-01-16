package com.tnb.pages;

import org.openqa.selenium.By;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;

public class BasePage {
	
	protected void click(By by, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).click();
	}
	
	protected void sendkeys(By by, String value, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).sendKeys(value);
	}
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
	

}
