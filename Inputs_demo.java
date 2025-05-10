package playwright_java_test;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.*;

public class Inputs_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		
		Browser browser = playwright.chromium().launch(lp);
		Page page = browser.newPage();
		page.navigate("https://letcode.in/edit");
		page.setViewportSize(1920, 1080);
		
		page.locator("#fullName").type("venkat");
		Locator textbox1 = page.locator("#join");
		textbox1.fill("Test message, please ignore it");
		textbox1.press("Tab");
		Locator textbox2 =page.locator("#getMe");
		System.out.println(textbox2.getAttribute("value"));
		//page.locator("clearMe").clear();
		page.locator("//input[@id='clearMe']").clear();
		
	}

}

//Testingbyvenkat...