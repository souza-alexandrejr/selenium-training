package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperPortalPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"top\"]/div[1]/div[1]/div/div/form/div[1]")
	private WebElement heading;
	
	@FindBy(xpath = "//*[@id=\"save_new_company_create_lead\"]")
    private WebElement joinToptalButton;
	
	// Constructor
	public DeveloperPortalPage(WebDriver driver) {
		this.driver = driver;
		
		// Initialize Elements
		PageFactory.initElements(driver, this);
    }
	
	// We will use this boolean for assertion. To check if page is opened
	public boolean isPageOpened(){
		return heading.getText().toString().contains("What role would you like to hire?");
	}
	
	@FindBy(xpath = "//*[@id=\"top\"]/div[1]/div[1]/div/div/form/div[2]/div/div[1]/label/span[1]")
	WebElement checkbox_developers;
	
	public void setCheckbox_developers() {
		checkbox_developers.click();
	}

	public void clickOnJoin(){
		joinToptalButton.click();
	}

}
