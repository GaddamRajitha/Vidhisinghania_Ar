package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_54;
import com.create4.scenarios.TS_55;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Compexp_prjctstatus4_msdcsn_TS_55{
	
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
	public void CRe4_1522() throws Exception {

		TS_55 ProjectStatus = new TS_55();

		ProjectStatus.CRe4_1522();

	}
	@Test
	public void CRe4_1527() throws Exception {

		TS_55 ProjectStatus = new TS_55();

		ProjectStatus.CRe4_1527();

	}
	@Test
	public void CRe4_1532() throws Exception {

		TS_55 ProjectStatus = new TS_55();

		ProjectStatus.CRe4_1532();

	}
	@Test
	public void CRe4_1537() throws Exception {

		TS_55 ProjectStatus = new TS_55();

		ProjectStatus.CRe4_1537();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
