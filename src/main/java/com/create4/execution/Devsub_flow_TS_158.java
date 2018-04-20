package com.create4.execution;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_158;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Devsub_flow_TS_158 {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test (priority = 0)
	public void CRe4_2154() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2154_2163_2164();

	}

	

	@Test (priority = 1)
	public void CRe4_2165() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2165();

	}

	@Test 
	public void CRe4_2166_2167_2168() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2166_2167_2168();

	}

	@Test
	public void CRe4_2169() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2169();

	}
	
	@Test
	public void CRe4_2155_2156_2157() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2155_2156_2157();

	}

	@Test
	public void CRe4_2158_2159_2260_2161() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2158_2159_2260_2161();

	}

	@Test
	public void CRe4_2170() throws Exception {

		TS_158 i1 = new TS_158();
		i1.CRe4_2170();

	}

	

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
