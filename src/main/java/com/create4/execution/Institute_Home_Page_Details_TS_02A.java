package com.create4.execution;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.create4.scenarios.TS_02A;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Institute_Home_Page_Details_TS_02A  {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_12_14_15_21_23_24() throws Exception {

		TS_02A i1 = new TS_02A();
		i1.CRe4_12_14_15_21_23_24();

	}

	@Test
	public void CRe4_18_22_26_29_13() throws Exception {

		TS_02A i1 = new TS_02A();
		i1.CRe4_18_22_26_29_13();

	}
	
	@Test
	public void CRe4_25_27() throws Exception {

		TS_02A i1 = new TS_02A();
		i1.CRe4_25_27();

	}
	
	@Test
	public void CRe4_28_30() throws Exception {

		TS_02A i1 = new TS_02A();
		i1.CRe4_28_30();

	}
	
	@Test
	public void CRe4_16() throws Exception {

		TS_02A i1 = new TS_02A();
		i1.CRe4_16();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
