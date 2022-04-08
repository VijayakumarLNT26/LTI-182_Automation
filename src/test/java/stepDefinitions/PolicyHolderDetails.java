package stepDefinitions;

import Base.TestBase;
import Pages.LacaptialeLoginPage;
import Pages.PolicyHolderSection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PolicyHolderDetails extends TestBase{
	
	LacaptialeLoginPage loginpage = new LacaptialeLoginPage(driver);
	PolicyHolderSection policyholderpage = new PolicyHolderSection(driver);
	
	@Given("I login with valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_on_login_page_contract(String username, String password) throws InterruptedException {
	    System.out.println("In Given function");
	    Thread.sleep(10000);
		loginpage.enterUserName(username);

		loginpage.enterPassword(password);
		
		loginpage.clickLoginButton();
		
		Thread.sleep(8000);

	   
	}
	
	@When("I open existing application {string} and navigate to contract tab")
	public void i_open_existing_application_and_navigate_to_contract_tab(String applicationRef)  throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("In When function");
		
		policyholderpage.appID();
		Thread.sleep(8000);
		policyholderpage.contractClick();
		System.out.println("Moved to contract");
		
	}
	
	@Then("I select language as {string}")
	public void i_select_language_as(String language)  throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		policyholderpage.languageSelect(language);
		Thread.sleep(8000);
		System.out.println("language selected");
	}
	@Then("I select policy holder from dropdown as {string}")
	public void i_select_policy_holder_from_dropdown_as(String policyholder)  throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		policyholderpage.openPolicyHolder();
		policyholderpage.selectPolicyHolder(policyholder);
		Thread.sleep(8000);
	    
	}
	
	
	
	/*
	 * @When("I open existing application  \"([^\"]*)\" and navigate to contract tab"
	 * ) public void user_opens_existing_application(String applicationRef) throws
	 * InterruptedException { // Write code here that turns the phrase above into
	 * concrete actions System.out.println("In When function");
	 * 
	 * policyholderpage.appID(); Thread.sleep(8000);
	 * policyholderpage.contractClick(); }
	 * 
	 * 
	 * @Then("Select language as \"([^\"]*)") public void
	 * user_selects_language(String language) throws InterruptedException {
	 * 
	 * policyholderpage.languageSelect(language); Thread.sleep(8000);
	 * 
	 * }
	 */
	
	/*
	 * @When("Select policy holder from dropdown as \"([^\"]*)") public void
	 * user_selects_policyholder(String policyholder) throws InterruptedException {
	 * // Write code here that turns the phrase above into concrete actions
	 * 
	 * policyholderpage.openPolicyHolder();
	 * policyholderpage.selectPolicyHolder(policyholder); }
	 */
	
	@Then("I enter other policyholder \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enters_contract_info(String firstname, String lastname) throws InterruptedException {
		
		policyholderpage.enterLastName(lastname);
		policyholderpage.enterFirstName(firstname);
		Thread.sleep(8000);
		//contractpage.clear("dob");
		//contractpage.dob("19920202");
	}
	
	
	
	/*
	 * @Then("^user enters maritalStatus \"([^\"]*)\" and \"([^\"]*)\"$") public
	 * void user_enters_Gender_maritalStatus(String gender,String dob) throws
	 * InterruptedException {
	 * 
	 * 
	 * 
	 * //contractpage.selectGender(gender); //contractpage.dob(dob);
	 * //contractpage.maritalStatus("Single"); Thread.sleep(10000);
	 * 
	 * }
	 * 
	 * @Then("^user select address \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_select_profession_address_city(String city, String profession) throws
	 * InterruptedException {
	 * 
	 * 
	 * 
	 * policyholderpage.enterProfession(profession);
	 * policyholderpage.address("hajksdhkas"); policyholderpage.city(city);
	 * 
	 * }
	 * 
	 * @Then("^user select province \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_select_province(String postalCode, String telephone) throws
	 * InterruptedException {
	 * 
	 * //contractpage.province("Alberta"); policyholderpage.postalCode(postalCode);
	 * //contractpage.telephoneType("Cellular");
	 * policyholderpage.telephone(telephone);
	 * policyholderpage.enterSin("741787683"); policyholderpage.clickPayment();
	 * Thread.sleep(8000); }
	 */
}