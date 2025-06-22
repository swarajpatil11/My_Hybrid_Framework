package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_User_Page {
	@FindBy(xpath = "/html/body/div/aside/section/ul/li[3]/a/span")
	WebElement UserBTN;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	WebElement AddUserBTN;
	@FindBy(id = "username")
	WebElement TxTuserName;
	@FindBy(id = "mobile")
	WebElement TxTMobile;
	@FindBy(id = "email")
	WebElement TxTemail;
	@FindBy(id = "course")
	WebElement TxTcource;
	@FindBy(id = "Male")
	WebElement GenderBTN;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")
	WebElement StateDDown;
	@FindBy(id = "password")
	WebElement TxTAddUserPass;
	@FindBy(id = "submit")
	WebElement SubMitBTN;

	public Add_User_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Locators(String username, String mobile, String cource, String pass, String email) {
		UserBTN.click();
		AddUserBTN.click();
		TxTuserName.sendKeys(username);
		TxTMobile.sendKeys(mobile);
		TxTemail.sendKeys(email);
		TxTcource.sendKeys(cource);
		GenderBTN.click();
		WebElement ddown = StateDDown;
		Select select = new Select(ddown);
		select.selectByValue("Maharashtra");

		TxTAddUserPass.sendKeys(cource);
		SubMitBTN.click();

	}

}
