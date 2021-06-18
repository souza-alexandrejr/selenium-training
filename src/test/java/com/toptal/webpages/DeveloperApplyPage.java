package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperApplyPage {

	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"top\"]/div[1]/div[1]/div/div/div[3]/div/div[1]")
	private WebElement heading;
//
//	@FindBy(id = "developer_email")
//	WebElement developer_email;
//
//	@FindBy(id = "developer_password")
//	WebElement developer_password;
//
//	@FindBy(id = "developer_password_confirmation")
//	WebElement developer_password_confirmation;
//
//	@FindBy(id = "developer_full_name")
//	WebElement developer_full_name;
//
//	@FindBy(id = "developer_skype")
//	WebElement developer_skype;
//
//	@FindBy(id = "save_new_developer")
//	WebElement join_toptal_button;
	
	@FindBy(xpath = "//*[@id=\"quiz-form\"]/div/div/div[1]/label/span")
	private WebElement checkbox_new_idea_project;
	
	@FindBy(xpath = "//*[@id=\"top\"]/div[1]/div[1]/div/div/div[3]/div/div[2]/button")
	private WebElement button_next;

	// Constructor
	public DeveloperApplyPage(WebDriver driver) {
		this.driver = driver;

		// Initialize Elements
		PageFactory.initElements(driver, this);
	}

	// Setter methods for every field that simulate keystrokes

//	public void setDeveloper_email(String email) {
//		developer_email.clear();
//		developer_email.sendKeys(email);
//	}
//
//	public void setDeveloper_password(String password) {
//		developer_password.clear();
//		developer_password.sendKeys(password);
//	}
//
//	public void setDeveloper_password_confirmation(String password_confirmation) {
//		developer_password_confirmation.clear();
//		developer_password_confirmation.sendKeys(password_confirmation);
//	}
//
//	public void setDeveloper_full_name(String fullname) {
//		developer_full_name.clear();
//		developer_full_name.sendKeys(fullname);
//	}
//
//	public void setDeveloper_skype(String skype) {
//		developer_skype.clear();
//		developer_skype.sendKeys(skype);
//	}
	
	public void setCheckbox_newIdeaProject() {
		checkbox_new_idea_project.click();
	}

	public void clickOnJoin() {
		button_next.click();
	}

	public boolean isPageOpened() {
		// Assertion
		return heading.getText().toString().contains("What type of project are you hiring for?");
	}

}
