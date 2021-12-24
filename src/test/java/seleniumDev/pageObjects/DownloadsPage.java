package seleniumDev.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import Dframework.PageObject;
import seleniumDev.controlExtensions.MenuPaths;

public class DownloadsPage extends PageObject {

	public DownloadsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DownloadsPage navigate() {
		getMenu().navigate(MenuPaths.Downloads);
		
		return this;
	}
}
