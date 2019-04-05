package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Rti EPS Summary"                                
               , summary=""
               , page="RtiEPSSummary"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Pay_Period__c"
               , connection="Admin"
     )             
public class xcdhcm__RtiEPSSummary {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:SelectList[@id='emprList']")
	public WebElement selectEmployer;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:SelectList[@id='taxYearList']")
	public WebElement selectTaxYear;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:SelectList[@id='dateList']")
	public WebElement selectPeriod;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='theButton']")
	public WebElement createEPS;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]/apex:commandButton[@action='{!newEPS}']")
	public WebElement oK;
	
}
