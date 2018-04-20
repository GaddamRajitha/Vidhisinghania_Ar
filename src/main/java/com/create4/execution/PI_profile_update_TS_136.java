package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_136;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class PI_profile_update_TS_136  {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}
	
	@Test
	public void CRe4_684() throws Exception {

		TS_136 SearchPI = new TS_136();

		SearchPI.CRe4_684();
	}

	@Test
	public void CRe4_686() throws Exception {

		TS_136 SearchPI = new TS_136();

		SearchPI.CRe4_686();
	}

	@Test
	public void CRe4_686_a() throws Exception {

		TS_136 SearchPI = new TS_136();

		SearchPI.CRe4_686_a();
	}

	@Test
	public void CRe4_687() throws Exception {

		TS_136 SearchPI = new TS_136();

		SearchPI.CRe4_687();
	}

	@Test
	public void CRe4_697_698_699_700_701_702_703_704_705() throws Exception {

		TS_136 SearchPI = new TS_136();

		SearchPI.CRe4_697_698_699_700_701_702_703_704_705();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
