package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Personal Edit"                                
               , summary=""
               , page="PersonalEdit"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Employee_Detail__c"
               , connection="LogonAs"
     )             
public class PersonalEdit {

	@TextType()
	@FindByLabel(label = "Tax code", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement taxCode;
	@ChoiceListType(values = { @ChoiceListValue(value = "Week1/Month1"), @ChoiceListValue(value = "Cumulative") })
	@FindByLabel(label = "Tax basis", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement taxBasis;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//span[2]/span/input[2]")
	public WebElement save;
	@ChoiceListType(values = { @ChoiceListValue(value = "A  All other employees"), @ChoiceListValue(value = "B  Married women and widows entitled to pay reduced NI (attach form CA4139/CF383/CF380A)"), @ChoiceListValue(value = "C  Employees over State pension age (attach passport/birth certificate)"), @ChoiceListValue(value = "J   Employees deferring NI/paying in another job (attach deferment certificate per tax year)"), @ChoiceListValue(value = "M  Employees under 21 (attach passport/birth certificate)"), @ChoiceListValue(value = "X  Not liable for NI"), @ChoiceListValue(value = "Z  Employees under 21 deferring NI/paying in another job (attach deferment certificate per tax year)"), @ChoiceListValue(value = "I standard contracted-out NICs"), @ChoiceListValue(value = "D All employees apart from those in groups E, C and L in this table"), @ChoiceListValue(value = "E Married women and widows entitled to pay reduced National Insurance"), @ChoiceListValue(value = "L Employees who can defer National Insurance because they’re already paying it in another job"), @ChoiceListValue(value = "H Apprentices under the age of 25."), @ChoiceListValue(value = "K Contracted-out salary related deferred rate contributions for employees under 21.") })
	@FindBy(xpath = "//select[@id='j_id0:j_id6:j_id35:j_id145:j_id146:3:j_id154']")
					
	public WebElement nICategory;
	
}
