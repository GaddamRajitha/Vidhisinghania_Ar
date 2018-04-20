package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_157;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Amend_sub_flow_TS_157 {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		// GlobalMethods g = new GlobalMethods();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1, 0).getContents();
		String FirefoxBrowser = r1.getCell(1, 1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_2108() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2108();

	}

	@Test
	public void CRe4_2109_2110_2111() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2109_2110_2111();

	}

	@Test
	public void CRe4_2112_2113_2114_2115() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2112_2113_2114_2115();

	}

	@Test
	public void CRe4_2117_2118() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2117_2118();

	}

	@Test
	public void CRe4_2119() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2119();

	}

	@Test
	public void CRe4_2120_2121_2122() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2120_2121_2122();

	}

	@Test
	public void CRe4_2123() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2123();

	}

	@Test
	public void CRe4_2124() throws Exception {

		TS_157 i1 = new TS_157();
		i1.CRe4_2124();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
