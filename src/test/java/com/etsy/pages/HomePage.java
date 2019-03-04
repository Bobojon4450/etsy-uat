package com.etsy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.etsy.utilities.ConfigReader;
import com.etsy.utilities.Driver;

public class HomePage {

	private WebDriver driver = Driver.getInstance();
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//input[@id='search-query']")
	public WebElement search;
	
	@FindBy(xpath ="//button[@class='btn btn-primary']")
	public WebElement searchButton;
	
	
	public void open() {
		driver.get(ConfigReader.getProperty("url"));
	}
	
}
