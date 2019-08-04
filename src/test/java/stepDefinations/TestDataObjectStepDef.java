package stepDefinations;

import java.util.Iterator;
import java.util.List;

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
}
