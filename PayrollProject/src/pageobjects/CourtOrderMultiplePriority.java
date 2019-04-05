package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Court Order Multiple Priority"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class CourtOrderMultiplePriority {

@PageRow()
	public static class DoNotTouchPayrollReport {
		
	
		@FindBy(xpath = ".//td[1]//a")
		public WebElement employeeName;
	
		
		@FindBy(xpath = ".//td[2]//div[@class='wave-table-cell-text']")
		public WebElement courtOrder;
		
				
		@FindBy(xpath = ".//td[3]//div[@class='wave-table-cell-text']")
		public WebElement attachableEarnings1;
		
		
		@FindBy(xpath = ".//td[4]//div[@class='wave-table-cell-text']")
		public WebElement initialDeductionAmount1;
		
		@FindBy(xpath = ".//td[5]//div[@class='wave-table-cell-text']")
		public WebElement attachableEarnings2;
		
		@FindBy(xpath = ".//td[6]//div[@class='wave-table-cell-text']")
		public WebElement protectedEarnings1;
		
		@FindBy(xpath = ".//td[7]//div[@class='wave-table-cell-text']")
		public WebElement pymtShortfallContbn;
		
		
		@FindBy(xpath = ".//td[8]//div[@class='wave-table-cell-text']")
		public WebElement benfitShortfallContbn;
			
		
		@TextType
		@FindBy(xpath = ".//td[9]/div/div[@class='wave-table-cell-text']/a")
		public WebElement benefit;
		
			
		@TextType
		@FindBy(xpath = ".//td[last()-1]/div/div")
		public WebElement type;
		
		@TextType
		@FindBy(xpath = ".//td[last()]/div/div")
		public WebElement amount1;
		
		
		
	}
	
	
	@PageFrame()
	public static class Frame1{
	
	@FindBy(xpath = "//table[contains(@class, 'data-grid-table data-grid-full-table')]//tr[not(contains(@class,'data-grid-table-row-start data-grid-header-row'))]")
	@PageTable(firstRowContainsHeaders = false, row = DoNotTouchPayrollReport.class)
	public List<DoNotTouchPayrollReport> DoNotTouchPayrollReport;
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH AUTOMATION EMP 141")
	public WebElement dONOTTOUCHAUTOMATIONEMP141;
	
	
	}
	
	@FindBy(xpath="//iframe[@class='isView reportsReportBuilder']")
	public Frame1 frame1;
			
}




