package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.create4.scenarios.TS_30;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Annexures_add_TS_30{
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		//GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}
	@Test
	public void CRe4_1109() throws Exception {

		TS_30 AddIECSubmission = new TS_30();

		AddIECSubmission.AddIECSubmission_CRe4_1109();
	}
	@Test
	public void CRe4_1111() throws Exception {

		TS_30 AddIECSubmission = new TS_30();

		AddIECSubmission.AddIECSubmission_CRe4_1111();
	}
	@Test
	public void CRe4_1113__1116_1122() throws Exception {

		TS_30 AddIECSubmission = new TS_30();

		AddIECSubmission.AddIECSubmission_CRe4_1113__1116_1122();
	}
   @Test
	public void CRe4_1121() throws Exception {

		TS_30 AddIECSubmission = new TS_30();

		AddIECSubmission.AddIECSubmission_CRe4_1121();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
