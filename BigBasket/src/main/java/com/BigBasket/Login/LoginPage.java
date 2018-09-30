package com.BigBasket.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//*[@id=\"input\"]")
	WebElement textfield;

	@FindBy(xpath = "//div[@class='input-group-btn']")
	WebElement clicksearch;

	@FindBy(xpath = "//div[@class='ng-scope']//a[contains(@class,'ng-binding') and contains(@href,'/pd/208345')]")
	WebElement QuakerOats;

	@FindBy(xpath = "//div/input[contains(@class,'sc-kp') and contains(@id,'radio_0')]/following-sibling::label")
	WebElement RadioBtn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[5]/button/span")
	WebElement Addcart;

	public void BB_action(String tf) {
		textfield.sendKeys(tf);
		clicksearch.click();
		QuakerOats.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		RadioBtn.click();
		Addcart.click();
		System.out.println("Item is added to cart");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.close();

	}
}