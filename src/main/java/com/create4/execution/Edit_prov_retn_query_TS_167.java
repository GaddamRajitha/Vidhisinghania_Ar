package com.create4.execution;

import java.io.FileInputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_167;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Edit_prov_retn_query_TS_167 {
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
	public void CRe4_1954() throws Exception {

		TS_167 i1 = new TS_167();
		i1.CRe4_1954();

	}

	@Test
	public void CRe4_1955() throws Exception {

		TS_167 i1 = new TS_167();
		i1.CRe4_1955();

	}

	@Test
	public void CRe4_1956() throws Exception {

		TS_167 i1 = new TS_167();
		i1.CRe4_1956();

	}

	@Test
	public void CRe4_1957() throws Exception {

		TS_167 i1 = new TS_167();
		i1.CRe4_1957();

	}

	@Test
	public void CRe4_1958() throws Exception {

		TS_167 i1 = new TS_167();
		i1.CRe4_1958();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		
	}

}
