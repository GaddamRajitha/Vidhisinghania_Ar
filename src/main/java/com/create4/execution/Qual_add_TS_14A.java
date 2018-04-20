package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.create4.scenarios.TS_14A;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Qual_add_TS_14A{
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
	public void CRe4_928() throws Exception {

		TS_14A VerifyQualifi = new TS_14A();

		VerifyQualifi.AddQualification_CRe4_928_CRe4_921_CRe4_929();
	}

	@Test
	public void CRe4_930() throws Exception {

		TS_14A VerifyQualifi = new TS_14A();

		VerifyQualifi.AddQualification_CRe4_930();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
