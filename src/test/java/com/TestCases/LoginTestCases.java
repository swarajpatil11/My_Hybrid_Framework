package com.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.utilities.ReadExelLogin;

public class LoginTestCases extends BaseClass {

	@Test(dataProvider = "td")
	void ValidTest(String email, String password) {

		pg.Email(email);
		pg.Password(password);
		pg.Login();

		if (email.equals("kiran@gmail.com") && password.equals("123456")) {
			assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

		}
		if (email.equals("amit@gmail.com") && password.equals("amit@123")) {
			assertEquals(pg.Emailerror(), "Please enter email as kiran@gmail.com");
		}
		if (email.equals("Shan@gmail.com") && password.equals("shan@123")) {
			assertEquals(pg.Emailerror(), "Please enter email as kiran@gmail.com");
		}
		if (email.equals("!$%#@gmail.com") && password.equals("#$%^@!@#")) {
			assertEquals(pg.Emailerror(), "Please enter email as kiran@gmail.com");

		}

	}

	@DataProvider(name = "td")
	String[][] LoginData() throws Exception {

		String[][] data = ReadExelLogin.ReadXl();

		return data;

	}

}
