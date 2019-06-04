package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Apprenticship Levy NM April Variance"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class ApprenticshipLevyNMAprilVariance {
			
@PageRow()
	public static class DoNotTouchPayrollReport
	 {
		
		@FindBy(xpath = ".//td[4]//a")
		public WebElement employerNameee;
	
		
		@FindBy(xpath = ".//td[6]//div[@class='wave-table-cell-text']")
		public WebElement variance;
		
		
		
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
			
}


