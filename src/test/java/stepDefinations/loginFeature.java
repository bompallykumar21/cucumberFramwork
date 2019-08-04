package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testBase.TestBase;

public class loginFeature extends TestBase{
	
//	Given browser is launched
	@Given("^browser is launched$")
	public void browser_is_launched() throws Throwable {
		launchBrowsers();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
//		driver.quit();
	}
	
	@When("^valid username and password are entered$")
	public void valid_username_and_password_are_entered() throws Throwable {

	}

	@When("^clicked on Login button$")
	public void clicked_on_Login_button() throws Throwable {

	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
	
	}
}
