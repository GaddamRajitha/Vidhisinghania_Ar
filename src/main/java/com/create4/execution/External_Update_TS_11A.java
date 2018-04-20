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

public class External_Update_TS_11A{
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
	public void CRe4_901() throws Exception{

		TS_11A i1=new TS_11A();
		i1.CRe4_901();

	}
	
	@Test
	public void CRe4_902() throws Exception{

		TS_11A i1=new TS_11A();
		i1.CRe4_902();

	}
	
    @Test
	public void CRe4_903() throws Exception{

		TS_11A i1=new TS_11A();
		i1.CRe4_903();

	}
	
	@Test
	public void CRe4_904() throws Exception{

		TS_11A i1=new TS_11A();
		i1.CRe4_904();

	}
	@Test
	public void CRe4_905() throws Exception{

		TS_11A i1=new TS_11A();
		i1.CRe4_905();

	}


	
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}


}
