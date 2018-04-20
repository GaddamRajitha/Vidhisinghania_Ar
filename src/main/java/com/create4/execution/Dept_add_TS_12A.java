package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_12A;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Dept_add_TS_12A{

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
	public void CRe4_917_18_19_10() throws Exception {

		TS_12A VerifyDept = new TS_12A();

		VerifyDept.AddDepartment_CRe4_917_18_19_10();

	}

	@Test
	public void CRe4_920() throws Exception {

		TS_12A VerifyDept = new TS_12A();

		VerifyDept.AddDepartment_CRe4_920();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
