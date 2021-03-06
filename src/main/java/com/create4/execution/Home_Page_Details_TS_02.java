package com.create4.execution;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_01C;
import com.create4.scenarios.TS_02;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Home_Page_Details_TS_02  {
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
	public void CRe4_01_02_03_08_10_11() throws Exception {

		TS_02 i1 = new TS_02();
		i1.CRe4_01_02_03_08_10_11();

	}

	@Test
	public void CRe4_04() throws Exception {

		TS_02 i1 = new TS_02();
		i1.CRe4_04();

	}
	
	@Test
	public void CRe4_05() throws Exception {

		TS_02 i1 = new TS_02();
		i1.CRe4_04();

	}
	
	@Test
	public void CRe4_06() throws Exception {

		TS_02 i1 = new TS_02();
		i1.CRe4_04();

	}
	
	@Test
	public void CRe4_10() throws Exception {

		TS_02 i1 = new TS_02();
		i1.CRe4_04();

	}
	
	@Test
	public void CRe4_09() throws Exception {

		TS_02 i1 = new TS_02();
		i1.CRe4_04();

	}
	

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
