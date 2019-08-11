package stepDefinations;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.When;
import domainObjects.PetDetails;
import domainObjects.loginCred;
import pages.RediffPage;

public class TestDataObjectStepDef {
	loginCred logCred;	
	
	@When("^valid credentials are entered objectConcept$")
	public void valid_credentials_are_entered_objectConcept(List<loginCred> login) throws Throwable {
	     Iterator<loginCred> it =login.iterator();
	        while (it.hasNext()) {
	        	logCred = new loginCred();
	        	logCred = it.next();
	        }
	        System.out.println(logCred.getPasswordSecond());
	        RediffPage rediffPage=new RediffPage();
	        rediffPage.EnterLoginCredentials(logCred);
	  	}


	@When("^valid credentials are entered objectConcept again$")
	public void valid_credentials_are_entered_objectConcept_again(List<loginCred> login) throws Throwable {
	     Iterator<loginCred> it =login.iterator();
	        while (it.hasNext()) {
	        	logCred = new loginCred();
	        	logCred = it.next();
	        }
	        RediffPage rediffPage=new RediffPage();
	        rediffPage.EnterLoginCredentialsSecond(logCred);
	}
	
	@When("^executing script using smokeTest$")
	public void executing_script_using_smokeTest() throws Throwable {
		 System.out.println("smokeTest is launched");
		 Assert.assertTrue(false);
	}

	@When("^executing script using regressionTest$")
	public void executing_script_using_regressionTest() throws Throwable {
	 System.out.println("regressionTest is launched");
	}
}
