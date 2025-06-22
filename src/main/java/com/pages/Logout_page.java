package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[7]/a/span")
	WebElement LogOutBTN;

	public Logout_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void logout() {
		LogOutBTN.click();

	}

}
