package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.create4.scenarios.TS_57;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class SaeInt_prjctstatus4_msdcsn_TS_57{

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
	public void CRe4_1680() throws Exception {

		TS_57 ProjectStatus = new TS_57();

		ProjectStatus.CRe4_1680();

	}

	@Test
	public void CRe4_1733() throws Exception {

		TS_57 ProjectStatus = new TS_57();

		ProjectStatus.CRe4_1733();

	}


	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
