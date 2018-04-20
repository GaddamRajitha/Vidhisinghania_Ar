package com.create4.execution;

import java.io.FileInputStream;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.create4.scenarios.TS_02C;

import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Forgot_Password_in_Inst_Home_Page_TS_02C  {

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
	public void CRe4_112_to_124() throws Exception {

		TS_02C Institute = new TS_02C();

		Institute.CRe4_112_to_124();

	}
	
	


	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
