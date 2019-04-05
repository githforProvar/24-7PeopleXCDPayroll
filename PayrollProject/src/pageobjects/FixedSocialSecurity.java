package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Fixed Social Security"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     ) 
     
     
                 


public class FixedSocialSecurity {

	@PageRow()
	public static class DoNotTouchPayrollReport {
		
		@FindBy(xpath = ".//td[1]//a")
		public WebElement employeeName;
	
		
		@FindBy(xpath = ".//td[2]//div[@class='wave-table-cell-text']")
		public WebElement courtOrder;
		
		@FindBy(xpath = ".//td[3]//div[@class='wave-table-cell-text']")
		public WebElement attachableEarnings;
		//intitialDeduction
		
		@FindBy(xpath = ".//td[4]//div[@class='wave-table-cell-text']")
		public WebElement intitialDeduction;
				
		@FindBy(xpath = ".//td[5]//div[@class='wave-table-cell-text']")
		public WebElement attachableEarningsTwo;
		
		@FindBy(xpath = ".//td[6]//div[@class='wave-table-cell-text']")
		public WebElement protectedEarnings;
		
	
		@FindBy(xpath = ".//td[last()-1]/div/div")
		public WebElement type;
		
		
		@FindBy(xpath = ".//td[last()]/div/div")
		public WebElement amount1;

		
	}
	
	
	@PageFrame()
	public static class Frame1
	{
	
	@FindBy(xpath = "//table[contains(@class, 'data-grid-table data-grid-full-table')]//tr[not(contains(@class,'data-grid-table-row-start data-grid-header-row'))]")
	@PageTable(firstRowContainsHeaders = false, row = DoNotTouchPayrollReport.class)
	public List<DoNotTouchPayrollReport> DoNotTouchPayrollReport;
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH AUTOMATION EMP 117")
	public WebElement dONOTTOUCHAUTOMATIONEMP117;
	
	
	}
	
	@FindBy(xpath="//iframe[@class='isView reportsReportBuilder']")
	public Frame1 frame1;
			
}


