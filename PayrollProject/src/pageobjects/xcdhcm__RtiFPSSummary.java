package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Rti FPS Summary"                                
               , summary=""
               , page="RtiFPSSummary"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__RTI_Submission__c"
               , connection="Admin"
     )             
public class xcdhcm__RtiFPSSummary {

	@PageTable(row = RtisubmissionRecord.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!rtisubmissionRecord}\"]")
	public List<RtisubmissionRecord> RtisubmissionRecord;

	@PageRow(byColumn = true)
	public static class RtisubmissionRecord {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[not(@value)][1]")
		public WebElement rTI;
	}
	
}
