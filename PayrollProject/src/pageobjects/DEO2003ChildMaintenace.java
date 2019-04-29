
package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DEO 2003 Child Maintenace"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class DEO2003ChildMaintenace {

	@PageRow()
	public static class DoNotTouchPayrollReport {
		
		@FindBy(xpath = ".//td[1]//a")
		public WebElement employeeName;
	
		
		@FindBy(xpath = ".//td[2]//div/div[@class='wave-table-cell-text']")
		public WebElement courtOrder;
		
		@FindBy(xpath = ".//td[3]//div/div[@class='wave-table-cell-text']")
		public WebElement attachableEarnings;
		
		@FindBy(xpath = ".//td[4]//div/div[@class='wave-table-cell-text']")
		public WebElement netPay;
		
		@FindBy(xpath = ".//td[5]//div/div[@class='wave-table-cell-text']")
		public WebElement intitialDeduction;
		
		@FindBy(xpath = ".//td[6]//div/div[@class='wave-table-cell-text']")
		public WebElement attachableEarningsTwo;
		
		
		@FindBy(xpath = ".//td[7]//div/div[@class='wave-table-cell-text']")
		public WebElement protectedEarnings;
		
		@FindBy(xpath = ".//td[8]//div/div[@class='wave-table-cell-text']")
		public WebElement paymentShortfallContribution;
		
		
		@FindBy(xpath = ".//td[9]//div/div[@class='wave-table-cell-text']")
		public WebElement protectedEarningsContribution;
		
		
		@FindBy(xpath = ".//td[10]//div/div[@class='wave-table-cell-text']")
		public WebElement benefitShortFallCarryForward;
		
		@FindBy(xpath = ".//td[11]//div/div[@class='wave-table-cell-text']")
		public WebElement bprotectedEarningsCarryForward;
		
		
	@FindBy(xpath = ".//td[last()-1]/div/div")
		public WebElement type;
		
		
		@FindBy(xpath = ".//td[last()]/div/div")
		public WebElement amount1;
		
		
	}
	
	
	@PageFrame()
	public static class Frame1{
	
	@FindBy(xpath = "//table[contains(@class, 'data-grid-table data-grid-full-table')]//tr[not(contains(@class,'data-grid-table-row-start data-grid-header-row'))]")
	@PageTable(firstRowContainsHeaders = false, row = DoNotTouchPayrollReport.class)
	public List<DoNotTouchPayrollReport> DoNotTouchPayrollReport;
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH AUTOMATION EMP 115")
	public WebElement dONOTTOUCHAUTOMATIONEMP115;
	
	
	}
	
	@FindBy(xpath="//iframe[@class='isView reportsReportBuilder']")
	public Frame1 frame1;
			
}















