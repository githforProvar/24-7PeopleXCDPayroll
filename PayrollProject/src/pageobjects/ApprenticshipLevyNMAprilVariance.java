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
		@TextType()
		@FindBy(xpath = ".//td//a")
		public WebElement employerNameee;
	
		@TextType()
		@FindBy(xpath = ".//td[@class='data-grid-table-cell lightning-table-numeric-cell data-grid-table-cell-odd']//div//div")
		public WebElement variance;
		
	}
	@PageFrame()
	public static class Frame1{
	
	@PageTable(row = DoNotTouchPayrollReport.class,firstRowContainsHeaders = false)
	@FindBy(xpath = "//table[contains(@class, 'data-grid-table data-grid-full-table')]//tr[not(contains(@class,'data-grid-table-row-start data-grid-header-row'))]")
	public List<DoNotTouchPayrollReport> DoNotTouchPayrollReportList;
	}
	@FindBy(xpath="//iframe[@title='Report Viewer']")
	public Frame1 frame1;
	

}


