package stepDefinations;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testBase.TestBase;

public class TestDataStepDefs extends TestBase{
	
	@When("^valid \"([^\"]*)\" and \"([^\"]*)\" are entered$")
	public void valid_and_are_entered(String userName, String password) throws Throwable {
	System.out.println(userName+"--- "+password);
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys(userName);
		
	}
	
	@Then("^test is \"([^\"]*)\"$")
	public void test_is(String arg1) throws Throwable {
		System.out.println(arg1);
	}


}
