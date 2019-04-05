package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CompensationClone"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class CompensationClone {

	@ButtonType()
	@FindBy(linkText = "Edit")
	public WebElement Edit;
	@ButtonType()
	@FindBy(linkText = "Edit")
	public WebElement Edit1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"test-id__record-layout-container\")]/div/div[2]/div/div/div[1]/div[1]/div/div/div/input")
	public WebElement AnnualSalaryOfCompnClone;
	@FindBy(xpath = "//span[contains(text(),'Payroll frequency')]/../following-sibling::div/div/div/div/a")
	@ChoiceListType(values = { @ChoiceListValue(value = "Monthly"), @ChoiceListValue(value = "Weekly"), @ChoiceListValue(value = "Two Weekly"), @ChoiceListValue(value = "Four Weekly"), @ChoiceListValue(value = "Irregular"), @ChoiceListValue(value = "Quarterly") })
	public WebElement xcdhcm__Payroll_Frequency__c;
	@ButtonType()
	@AuraBy(componentXPath = "//force:modal//ui:button[@aura:id= 'action-button']")
	public WebElement SaveButtonOfCompnClone;
	@ButtonType()
	@FindBy(xpath = "//button[3]//span")
	public WebElement CompnSaveButton;
	@FindBy(xpath = "//span[contains(text(),'Payroll frequency')]/../following-sibling::div/div/div/div/a")
	@ChoiceListType(values = { @ChoiceListValue(value = "Monthly"), @ChoiceListValue(value = "Weekly"), @ChoiceListValue(value = "Two Weekly"), @ChoiceListValue(value = "Four Weekly"), @ChoiceListValue(value = "Irregular"), @ChoiceListValue(value = "Quarterly") })
	public WebElement xcdhcm__Payroll_Frequency__c1;
			
}
