package stepDefinations;

import java.util.Iterator;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domainObjects.PetDetails;

public class insurance {

	@Given("^User login to Salesforce application with valid Credentials$")
	public void user_login_to_Salesforce_application_with_valid_Credentials() throws Throwable {
	    System.out.println("User login to Salesforce application with valid Credentials");
	    
	}

	@When("^user navigates to \"([^\"]*)\" link$")
	public void user_navigates_to_link(String arg1) throws Throwable {
	    System.out.println();
	    
	}

	@When("^A lead is created with following data$")
	public void a_lead_is_created_with_following_data(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
		 System.out.println();
	}

	@When("^fill in pet details$")
	public void fill_in_pet_details(List<PetDetails> petDetails) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("fill in pet details"+petDetails);
		 PetDetails petDetailsObj = null;
	     Iterator<PetDetails> it =petDetails.iterator();
	        while (it.hasNext()) {
	        	petDetailsObj = new PetDetails();
	            petDetailsObj = it.next();
	        }
	      System.out.println("###"+petDetailsObj.getPetName());
	      
	}

	@When("^get the quote$")
	public void get_the_quote() throws Throwable {
		 System.out.println();
	    
	}

	@Then("^store the values for below$")
	public void store_the_values_for_below(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("store_the_values_for_below"+arg1);
	}

	@Then("^Save the quote$")
	public void save_the_quote() throws Throwable {
		 System.out.println();
	    
	}

	@When("^user edit the person account details$")
	public void user_edit_the_person_account_details() throws Throwable {
		 System.out.println();
	    
	}

	@When("^A lead is created with following address$")
	public void a_lead_is_created_with_following_address(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println();
	}

	@When("^user saves the account info$")
	public void user_saves_the_account_info() throws Throwable {
	    
		 System.out.println();
	}

	@When("^user clicks on enrollment button$")
	public void user_clicks_on_enrollment_button() throws Throwable {
	    
		 System.out.println();
	}

	@When("^user performs the enrollment with following insured info$")
	public void user_performs_the_enrollment_with_following_insured_info(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println();
	}

	@When("^user performs the enrollment with following origin info$")
	public void user_performs_the_enrollment_with_following_origin_info(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println();
	}

	@When("^user performs the enrollment with following pet info$")
	public void user_performs_the_enrollment_with_following_pet_info(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println();
	}

	@When("^user performs the enrollment with following product info$")
	public void user_performs_the_enrollment_with_following_product_info(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println();
	}

	@When("^answer following medical questions$")
	public void answer_following_medical_questions(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("answer following medical questions datatable#"+arg1);
	}

	@When("^user performs the enrollment with following payment info$")
	public void user_performs_the_enrollment_with_following_payment_info(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("user performs the enrollment with following payment info datatable#"+arg1);
	}

	@When("^Submit the enrollment application$")
	public void submit_the_enrollment_application() throws Throwable {
	    
		 System.out.println("Submit the enrollment application");
	}

	@Then("^Store Policy Number which is generated$")
	public void store_Policy_Number_which_is_generated() throws Throwable {
		 System.out.println("Store Policy Number which is generated");
	    
	}

	@Then("^Click on Make Payment button$")
	public void click_on_Make_Payment_button() throws Throwable {
	    
		 System.out.println("Click on Make Payment button");
	}

	@Then("^Verify Payment Successful$")
	public void verify_Payment_Successful() throws Throwable {
	    
		 System.out.println("Verify Payment Successful");
	}

	@Given("^User login to Ren application with valid Credentials$")
	public void user_login_to_Ren_application_with_valid_Credentials() throws Throwable {
	    
		 System.out.println("User login to Ren application with valid Credentials");
	}

	@Given("^Click on IT RESEARCH$")
	public void click_on_IT_RESEARCH() throws Throwable {
	    
		 System.out.println("Click on IT RESEARCH");
	}

	@Given("^Click on menu \"([^\"]*)\"$")
	public void click_on_menu(String arg1) throws Throwable {
	    
		 System.out.println("Click on menu #"+arg1);
	}

	@Given("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		 System.out.println("click_on#"+arg1);
	    
	}

	@Given("^Search for the generated policy number$")
	public void search_for_the_generated_policy_number() throws Throwable {
		 System.out.println("Search for the generated policy number");
	    
	}

	@Given("^click on Search$")
	public void click_on_Search() throws Throwable {
		 System.out.println("click on Search");
	    
	}

	@Given("^Click on Policy No$")
	public void click_on_Policy_No() throws Throwable {
		 System.out.println("Click on Policy No");
	    
	}

	@Then("^Verify Pet Name and Policy Number is valid$")
	public void verify_Pet_Name_and_Policy_Number_is_valid() throws Throwable {
	  
		 System.out.println("Verify Pet Name and Policy Number is valid"); 
	}
}
