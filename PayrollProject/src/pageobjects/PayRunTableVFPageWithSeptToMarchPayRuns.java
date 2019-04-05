package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Pay Run Table VF Page"                                
               , summary=""
               , page="PayrollDetailView"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__XCD_PAY_Payroll__c"
               , connection="Admin"
     )             
public class PayRunTableVFPageWithSeptToMarchPayRuns {

	@PageRow()
	public static class PayRollTable 
	{
		 @LinkType()
		 @FindBy(xpath = ".//th[1]//a")
		 public WebElement payRun;
		 
		 @ButtonType()
		 @FindBy(xpath = ".//td[1]//a[contains(@title,'Delete')]")
		 public WebElement deleteButton;
		 
		 @TextType()
		 @FindBy(xpath = ".//td[5]/span/span")
		 public WebElement status;
		 
		 @ButtonType()
	@FindBy(xpath = "//td[contains(@class,'pbButtonb')]/input[@title='Generate periods']")
	public WebElement generatePeriod;
    
			
	}
	
	@FindBy(xpath = "//table/tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = PayRollTable.class)
	public List<PayRollTable> payRollTable;
	
	
	/*
	@FindBy(xpath = "//h3[text()='Pay Runs']/ancestor::div[@class='pbHeader']/following-sibling::div[@class='pbBody']//table/tbody/tr[not(contains(@class,'headerRow'))]")
	@PageTable(firstRowContainsHeaders = false, row = PayRollTable.class)
	public List<PayRollTable> payRollTable;
	*/
	
	
}
