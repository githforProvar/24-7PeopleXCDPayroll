package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.provar.core.testapi.annotations.*;

@Page( title="Draft Color"                                
     , summary=""
     , relativeUrl=""
     , connection="LogonAs"
     )             
public class DraftColor {

	public WebDriver driver;
	
//	@TestLogger
//	private Logger logger;
	
	public DraftColor(WebDriver driver) {
		this.driver = driver;
	}
	
	//@PageOperation
	public String ColorMethodControl() {
		String param1 = driver.findElement(By.xpath("//div/span[contains(@style,'background')]")).getAttribute("style");
		return param1;
	}
			
}
