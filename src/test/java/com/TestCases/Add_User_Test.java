package com.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class Add_User_Test extends BaseClass {

	@Test
	public static void Adduser() {

		pg.Email("kiran@gmail.com");
		pg.Password("123456");
		pg.Login();

	     ap.Locators("user12345", "9876543210", "user", "selenium", "123456@gmail.com");
		Alert alert = driver.switchTo().alert();
		assertEquals(alert.getText(), "User Added Successfully. You can not see added user.");
		alert.accept();

	}
}