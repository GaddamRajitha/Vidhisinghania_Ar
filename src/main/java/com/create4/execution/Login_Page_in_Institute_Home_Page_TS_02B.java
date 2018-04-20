package com.create4.execution;

import java.io.FileInputStream;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.create4.scenarios.TS_02B;

import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Login_Page_in_Institute_Home_Page_TS_02B  {

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
	public void CRe4_101_102() throws Exception {

		TS_02B Institute = new TS_02B();

		Institute.CRe4_101_102();

	}
	
	@Test
	public void CRe4_103_104_109() throws Exception {

		TS_02B Institute = new TS_02B();

		Institute.CRe4_103_104_109();

	}
	
	@Test
	public void CRe4_108() throws Exception {

		TS_02B Institute = new TS_02B();

		Institute.CRe4_108();

	}
	
	@Test
	public void CRe4_111() throws Exception {

		TS_02B Institute = new TS_02B();

		Institute.CRe4_111();

	}

	
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
