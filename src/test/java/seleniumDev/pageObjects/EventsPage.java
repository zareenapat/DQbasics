package seleniumDev.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import Dframework.PageObject;
import seleniumDev.controlExtensions.MenuPaths;

public class EventsPage extends PageObject {

	public EventsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public EventsPage navigate() {
		getMenu().navigate(MenuPaths.AboutEvents);	
		
		return this;
	}
}
