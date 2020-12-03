package com.TrinityTwo.base;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.TrinityTwo.session.TrinityTwoTestSession;
import com.TrinityTwo.util.Xls_Reader;

public class TestBase {
	
	public TrinityTwoTestSession session;
	public String testName=null;
	public Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//Data.xlsx");
	
	@BeforeMethod
	public void init(ITestResult result) {
		System.out.println("@BeforeMethod");
		testName = result.getMethod().getMethodName().toUpperCase();
		System.out.println(testName);
		session= new TrinityTwoTestSession();
		session.init(testName);
	}
	
	@AfterMethod
	public void quit() {
		session.generateReport();
	}
	
}
