package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;


@Page( title="Report"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class Report1 {

	@PageRow()
	public static class DoNotTouchPayrollReport
	 {
		
		@FindBy(xpath = ".//td[1]//a")
		public WebElement employeeName;
		
		@FindBy(xpath = ".//td[2]//div[@class='wave-table-cell-text']")
		public WebElement EmployeeNI;
		
		@FindBy(xpath = ".//td[3]//div[@class='wave-table-cell-text']")
		public WebElement EmployerNI;
		
		@FindBy(xpath = ".//td[4]//div[@class='wave-table-cell-text']")
		public WebElement ptToUELPayYTD;
		
		
		@FindBy(xpath = ".//td[5]//div[@class='wave-table-cell-text']")
		public WebElement employeeNIYTD;
		
	}
	
	
	@PageFrame()
	public static class Frame1{
	
	@FindBy(xpath = "//table[contains(@class, 'data-grid-table data-grid-full-table')]//tr[not(contains(@class,'data-grid-table-row-start data-grid-header-row'))]")
	@PageTable(firstRowContainsHeaders = false, row = DoNotTouchPayrollReport.class)
	public List<DoNotTouchPayrollReport> DoNotTouchPayrollReport;
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH AUTOMATION EMP 108")
	public WebElement dONOTTOUCHAUTOMATIONEMP108;
	
	
	}
	
	@FindBy(xpath="//iframe[@class='isView reportsReportBuilder']")
	public Frame1 frame1;
			



///////////////////////////////
	
	public static class EPS {

		@ButtonType()
		@FindBy(xpath = ".//td[2]/input[contains(@value,'New EPS')]")
		public WebElement newEPS;
		@ChoiceListType()
		@FindByLabel(label = "Select employer")
		public WebElement selectEmployer;
		@ChoiceListType()
		@FindByLabel(label = "Select period")
		public WebElement selectPeriod;
		@LinkType()
		@FindBy(xpath = "//div[contains(@class,'pbBody')]/table/tbody/tr/td//a")
		public WebElement rTI;
		
		@ChoiceListType()
		@FindByLabel(label = "Select tax year")
		public WebElement selectTaxYear;

	}
	
	
	@FindBy(xpath = "//div[contains(@class,'pbHeader')]/table/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = EPS.class)
	public List<DoNotTouchPayrollReport> EPS;
	

	
	@PageFrame()
	public static class Frame2 {
	}

	@FindBy(css = "#vfFrameId_1544268250012")
	public Frame2 frame2;
	
	
	@PageFrame()
	public static class Frame3 {
	}

	@FindBy(css = "#vfFrameId_1544268829163")
	public Frame3 frame3;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-page-header--object-home\")]/div[1]/div[1]")
	public WebElement reports;
			
}
