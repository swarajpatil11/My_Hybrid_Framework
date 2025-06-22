package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "email")
	WebElement TxTEmail;
	@FindBy(id = "password")
	WebElement txTPass;
	@FindBy(xpath = "//*[@id=\"form\"]/div[3]/div/button")
	WebElement LoginBTn;
	@FindBy(id = "email_error") WebElement EmailError;
	
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Email(String email) {
		TxTEmail.sendKeys(email);
	}

	public void Password(String pass) {
		txTPass.sendKeys(pass);
	}

	public void Login() {
		LoginBTn.click();
	}
	
	public String Emailerror() {
		
		return EmailError.getText();
	}

}
