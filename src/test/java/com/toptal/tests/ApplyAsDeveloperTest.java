package com.toptal.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.toptal.webpages.DeveloperApplyPage;
import com.toptal.webpages.DeveloperPortalPage;
import com.toptal.webpages.HomePage;

public class ApplyAsDeveloperTest {

	WebDriver driver;

	@Before
	public void setup() {
		// use FF Driver
		// driver = new FirefoxDriver();
		
		// use Chrome Driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void applyAsDeveloper() {
		// Create object of HomePage Class
		HomePage home = new HomePage(driver);
		home.clickOnDeveloperApplyButton();

		// Create object of DeveloperPortalPage
		DeveloperPortalPage devportal = new DeveloperPortalPage(driver);

		// Check if page is opened
		Assert.assertTrue(devportal.isPageOpened());

		// Click on Join Toptal
		// devportal.clickOnJoin();
		devportal.setCheckbox_developers();
		System.out.println("Clicking on Developers button");
		devportal.clickOnJoin();
		System.out.println("Clicking on Get Started button");

		// Create object of DeveloperApplyPage
		DeveloperApplyPage applyPage = new DeveloperApplyPage(driver);
		System.out.println("applyPage object created!");

		// Check if page is opened
		//Assert.assertTrue(applyPage.isPageOpened());
		//System.out.println("applyPage is opened!");

		// Fill up data
		applyPage.setCheckbox_newIdeaProject();
//		applyPage.setDeveloper_email("dejan@toptal.com");
//		applyPage.setDeveloper_full_name("Dejan Zivanovic Automated Test");
//		applyPage.setDeveloper_password("password123");
//		applyPage.setDeveloper_password_confirmation("password123");
//		applyPage.setDeveloper_skype("automated_test_skype");

		// Click on join
		// applyPage.clickOnJoin();
	}

	@After
	public void close() {
		driver.close();
	}

}
