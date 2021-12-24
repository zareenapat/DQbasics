package Dampeg.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import Dframework.PageObject;

public class Svt410HlfProductDetailsPage extends PageObject {

	private String getHandlingWeightScript = "return document.evaluate(\"//div[@class='specsCopy']//b[text()='Handling Weight:']/following-sibling::text()[1]\" ,document, null, XPathResult.STRING_TYPE, null).stringValue;";

	public Svt410HlfProductDetailsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String getHandlingWeight() {
		String handlingWeight = (String)super.executeJavascript(getHandlingWeightScript, null);
		
		return handlingWeight.trim();
	}
}