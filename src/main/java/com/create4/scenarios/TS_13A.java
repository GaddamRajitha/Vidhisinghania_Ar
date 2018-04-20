package com.create4.scenarios;

import java.io.FileInputStream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.global.methods.GlobalMethods;
import com.global.methods.GlobalWait;

import jxl.Sheet;
import jxl.Workbook;

//***Check for department details update functionality ***//
public class TS_13A {
	public TS_13A()
	{
		//this.driver=driver;
		//driver = GlobalMethods.driver;
		PageFactory.initElements(GlobalMethods.driver,this);
	}
	
	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);
	
	@FindBy(xpath="//a[contains(text(),'Manage IEC')]")
	WebElement Manage_IEC;
	
	@FindBy(xpath="//li[4]/ul/li[4]/a")
	WebElement Manage_Departments;
	
	@FindBy(css=".col-sm-10.col-xs-12.main-right>h3")
	WebElement Verify_DepartmentsName;
	
	@FindBy(css=".fa.fa-edit")
	WebElement EditLink;
	
	@FindBy(id="add_department_name")
	WebElement AddDepartmentTextbox;
	
	@FindBy(id="addDepartmentButton")
	WebElement Update_AddDepart;
	
	@FindBy(css=".help-block")
	WebElement Submit_BlankAlert;
	
	@FindBy(css=".bg-success.text-success.col-sm-12.text-center")
	WebElement AddDepartmentPopuptext;
	
	@FindBy(linkText="Logout")
	WebElement LogOut;
	
	public void CRe4_913_CRe4_910_CRe4_914_CRe4_916() throws Exception
	{
	
		//----------IEC Admin Login------------//
			GlobalMethods.Admin_Login();
			
			
			FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
			Workbook wb = Workbook.getWorkbook(fi);
			Sheet r = wb.getSheet("ManageIEC");
									
			String ManageDepart_text = r.getCell(2,11).getContents();
			
			WebElement Manage_IEC1=GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
			Manage_IEC1.click();
			WebElement Manage_Departments1=GWait.Wait_GetElementByXpath("//li[4]/ul/li[4]/a");
			Manage_Departments1.click();
			WebElement Verify_DepartmentsName1=GWait.Wait_GetElementByCSS(".col-sm-10.col-xs-12.main-right>h3");
			
			System.out.println("Test cases == CRe4_910");
			System.out.println(Verify_DepartmentsName1.getText());
			System.out.println(ManageDepart_text);
			System.out.println(Verify_DepartmentsName1.getText().equalsIgnoreCase(ManageDepart_text));
			WebElement EditLink1=GWait.Wait_GetElementByCSS(".fa.fa-edit");
			EditLink1.click();
			
			//----------Check for 'Edit' with blank data------//
			System.out.println("Test cases == CRe4_914");
			WebElement AddDepartmentTextbox1=GWait.Wait_GetElementById("add_department_name");
			AddDepartmentTextbox1.clear();
			WebElement Update_AddDepart1=GWait.Wait_GetElementById("addDepartmentButton");
			Update_AddDepart1.click();
			WebElement Submit_BlankAlert1=GWait.Wait_GetElementByCSS(".help-block");
			Assert.assertEquals(Submit_BlankAlert1.getText(),"Department field is required!");
			System.out.println(Submit_BlankAlert1.getText());
		
			
			WebElement LogOut1=GWait.Wait_GetElementByLinkText("Logout");
			LogOut1.click();
	
	}
}
