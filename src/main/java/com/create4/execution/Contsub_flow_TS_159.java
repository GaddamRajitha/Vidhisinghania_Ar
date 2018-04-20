package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_159;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Contsub_flow_TS_159 {
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
	public void CRe4_2202() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2202();

	}

	@Test
	public void CRe4_2203_2204_2205() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2203_2204_2205();

	}

	@Test
	public void CRe4_2206_2207_2208_2209() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2206_2207_2208_2209();

	}

	@Test
	public void CRe4_2211_2212() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2211_2212();

	}

	@Test
	public void CRe4_2213() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2213();

	}

	@Test
	public void CRe4_CRe4_2214_2215_2216() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_CRe4_2214_2215_2216();

	}

	@Test
	public void CRe4_2217() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2217();

	}

	@Test
	public void CRe4_2218() throws Exception {

		TS_159 i1 = new TS_159();
		i1.CRe4_2218();

	}

	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}

}
