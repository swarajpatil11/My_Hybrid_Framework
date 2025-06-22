package com.TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class LogOut_Test extends BaseClass {

	@Test
	public void Logout() {

		Add_User_Test.Adduser();
		lp.logout();
		assertEquals(driver.getTitle(), "JavaByKiran | Log in");

	}
}
