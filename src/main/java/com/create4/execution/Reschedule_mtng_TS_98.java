package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_98;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Reschedule_mtng_TS_98 {

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
	public void CRe4_241() throws Exception {

		TS_98 MSMeetingEdit = new TS_98();

		MSMeetingEdit.CRe4_241();
	}

	@Test
	public void CRe4_242() throws Exception {

		TS_98 MSMeetingEdit = new TS_98();

		MSMeetingEdit.CRe4_242();
	}

	@Test
	public void CRe4_243_245() throws Exception {

		TS_98 MSMeetingEdit = new TS_98();

		MSMeetingEdit.CRe4_243_245();
	}

	@Test
	public void CRe4_244() throws Exception {

		TS_98 MSMeetingEdit = new TS_98();

		MSMeetingEdit.CRe4_244();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
