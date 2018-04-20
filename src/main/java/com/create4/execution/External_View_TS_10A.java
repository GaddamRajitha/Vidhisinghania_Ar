package com.create4.execution;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.global.methods.*;

import jxl.Sheet;
import jxl.Workbook;

import com.create4.scenarios.*;

public class External_View_TS_10A{
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
	public void CRe4_893() throws Exception{

		TS_10A i1=new TS_10A();
		i1.CRe4_893();

	}
	
	@Test
	public void CRe4_898() throws Exception{

		TS_10A i1=new TS_10A();
		i1.CRe4_898();

	}
	
	@Test
	public void CRe4_899() throws Exception{

		TS_10A i1=new TS_10A();
		i1.CRe4_899();

	}
	
	@Test
	public void CRe4_900() throws Exception{

		TS_10A i1=new TS_10A();
		i1.CRe4_900();

	}

	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}


}
