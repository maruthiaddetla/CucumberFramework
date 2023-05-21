package com.GCMS.steps;

import com.GCMS.pages.LoginPage;
import com.GCMS.utils.CommonMethods;
import com.GCMS.utils.ConfigsReader;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends CommonMethods{

	@Given("user enters valid username")
	public void user_enters_valid_username() {
		sendText(loginPage.userName,ConfigsReader.getProperty("userName"));
	}

	@And("enters valid password")
	public void enters_valid_password() {
		sendText(loginPage.password,ConfigsReader.getProperty("password"));
	}
	@And("clicks on Login button")
	public void clicksOnLoginButton() {
		click(loginPage.loginButton);
	}

	@Then("user should navigate to products page")
	public void userShouldNavigateToProductsPage() {
		Assert.isTrue(loginPage.products.isDisplayed(),"Products page is not displayed");
	}


}
