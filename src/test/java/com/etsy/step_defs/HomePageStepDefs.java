package com.etsy.step_defs;

import org.openqa.selenium.WebDriver;
import com.etsy.pages.HomePage;
import com.etsy.utilities.Driver;
import com.etsy.utilities.TakeScreenShotMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDefs {

	TakeScreenShotMethods tkScren = new TakeScreenShotMethods();
	
	private WebDriver driver = Driver.getInstance();
	HomePage homePage = new HomePage();
	
	@Given("^The user on the home page$")
	public void the_user_on_the_home_page() throws Throwable {
	    homePage.open();
	    tkScren.takeScreenShotNewReport();
	}

	@When("^the user verifies the url$")
	public void the_user_verifies_the_url() throws Throwable {
		tkScren.takeScreenShotNewReport();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	}

}
