package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.Add_User_Page;
import com.pages.LoginPage;
import com.pages.Logout_page;
import com.utilities.ConfigFile;

public class BaseClass {
	public static LoginPage pg;
	public static WebDriver driver;
	public static Add_User_Page ap;
	public static Logout_page lp;

	@BeforeMethod
	public static void SetUp() throws Exception {

		String Brname = ConfigFile.ReadConfig("browser");
		if (Brname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (Brname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (Brname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("No browser found");
		}

		String URL = ConfigFile.ReadConfig("url");
		driver.get(URL);
		pg = new LoginPage(driver);
		ap = new Add_User_Page(driver);
		 lp = new Logout_page(driver);

	}

	@AfterMethod
	public static void Teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
