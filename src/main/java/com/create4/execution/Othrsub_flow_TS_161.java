package com.create4.execution;

import java.io.FileInputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_161;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Othrsub_flow_TS_161 {
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
	public void CRe4_2294() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2294();

	}
	
	@Test
	public void CRe4_2295_2296_2297() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2295_2296_2297();

	}

	@Test
	public void CRe4_2303_2304() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2303_2304();

	}

	@Test
	public void CRe4_2305() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2305();

	}

	@Test
	public void CRe4_2309() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2309();

	}

	@Test
	public void CRe4_2310_2336() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2310_2336();

	}

	

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
