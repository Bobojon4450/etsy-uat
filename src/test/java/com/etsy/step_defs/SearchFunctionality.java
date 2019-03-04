package com.etsy.step_defs;

import com.etsy.pages.HomePage;

import cucumber.api.java.en.Then;

public class SearchFunctionality {

	HomePage hp = new HomePage();
	@Then("^user searches for wooden spoon$")
	public void user_searches_for_wooden_spoon() throws Throwable {
	   hp.search.sendKeys("wooden spoon");
	   hp.searchButton.click();
	}

}
