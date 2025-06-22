package com.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class MyListeners implements ITestListener {
	public static ExtentTest test;
	public static final Logger logger = LogManager.getLogger(MyListeners.class);
	private static ExtentReports reports = MyReport.getInstance();

	@Override
	public void onTestStart(ITestResult result) {

		logger.info("test exicution started" + result.getName());
		test = reports.createTest("test case execution");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("test passed" + result.getName());
		test.log(Status.PASS, "test case pass" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String ss = TakeScreenshot.Screenshot(result.getName());
		logger.info("test failed ans screenshot taken");
		test.log(Status.FAIL, "test case fail" + result.getName());
		test.fail("attached ss below").addScreenCaptureFromPath(ss);
		test.addScreenCaptureFromPath(ss);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("test skipped" + result.getName());
		test.log(Status.SKIP, "test case skipped" + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("test started" + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("test finished" + context.getName());
		reports.flush();

	}

}
