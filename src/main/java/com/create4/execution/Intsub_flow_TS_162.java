package com.create4.execution;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_162;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Intsub_flow_TS_162{
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
	public void CRe4_1225() throws Exception {

		TS_162 i1 = new TS_162();
		i1.CRe4_1225();

	}

	@Test
	public void CRe4_1235() throws Exception {

		TS_162 i1 = new TS_162();
		i1.CRe4_1235();

	}

	@Test
	public void CRe4_1240() throws Exception {

		TS_162 i1 = new TS_162();
		i1.CRe4_1240();

	}

	@Test
	public void CRe4_1245() throws Exception {

		TS_162 i1 = new TS_162();
		i1.CRe4_1245();

	}

	@Test
	public void CRe4_1250() throws Exception {

		TS_162 i1 = new TS_162();
		i1.CRe4_1250();

	}

	@Test
	public void CRe4_1255() throws Exception {

		TS_162 i1 = new TS_162();
		i1.CRe4_1255();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
