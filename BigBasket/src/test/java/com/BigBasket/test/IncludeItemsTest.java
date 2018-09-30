package com.BigBasket.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BigBasket.Login.LoginPage;

public class IncludeItemsTest {
	@Test
	public void itemsinclude() {

		System.setProperty("webdriver.chrome.driver", "C:/Automation/selenium-java-3.14.0/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		LoginPage Loginactions = PageFactory.initElements(driver, LoginPage.class);
		Loginactions.BB_action("quaker oats");
		

	}
	
	
	
}




