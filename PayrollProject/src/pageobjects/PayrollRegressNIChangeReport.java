package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( connection="Admin"
     )             
public class PayrollRegressNIChangeReport {

	@PageRow()
	public static class DoNotTouchPayrollReport {
		
		@FindBy(xpath = ".//td[1]/a")
		public WebElement employeeName;
		
		@FindBy(xpath = ".//td[2]")
		public WebElement EmployeeNI;
		
		@FindBy(xpath = ".//td[3]")
		public WebElement EmployerNI;
		
		
	    
	}

	//@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[contains(@class, 'reportTable')]/tbody/tr")
	@PageTable(firstRowContainsHeaders = true, row = DoNotTouchPayrollReport.class)
	public List<DoNotTouchPayrollReport> DoNotTouchPayrollReport;
	@LinkType()
	@FindBy(xpath = "//th[contains(@class, \"dataCell\")]//a")
	public WebElement DeleteRTI_Record;
	
	@LinkType()
	    @FindBy(xpath = "//th[contains(@class, \"dataCell\")]//a")
	    public WebElement RTI_Record_to_delete;
	    
	    @LinkType()
	    @FindBy(xpath = "//table[contains(@class,'list')]/tbody/tr[2]/th[contains(@scope,'row')]/a")
	    public WebElement DeleteRTI;
		@LinkType()
		@FindBy(css = "th.dataCell a")
		public WebElement rTIS0340;
		@LinkType()
		@FindBy(xpath = "//th[contains(@class, \"dataCell\")]//a")
		public WebElement RTIRecord;
		@LinkType()
		@FindBy(linkText = "RTIS-0340")
		public WebElement rTIS03401;
	
	
			
}
