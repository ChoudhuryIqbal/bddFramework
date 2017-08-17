/**
 * 
 */
package Steps;

import base.BaseUtil;
import cucumber.api.java.en.*;

/**
 * @author choudhuryIqbal
 *
 */
public class SignUpStep extends BaseUtil{
	private BaseUtil base;
	public SignUpStep(BaseUtil base) {
		
	}
	@Given("^: I click My Account Tab$")
	public void i_click_My_Account_Tab() throws Throwable {
	    
	}

	@Given("^I click sign up from dropdown$")
	public void i_click_sign_up_from_dropdown() throws Throwable {
	   
	}
	@Given("^I enter the firstname as\"([^\"]*)\", last name as \"([^\"]*)\", mobile no as \"([^\"]*)\", email as \"([^\"]*)\",password as\"([^\"]*)\" and ;confirm it \"([^\"]*)\"$")
	public void i_enter_the_firstname_as_last_name_as_mobile_no_as_email_as_password_as_and_confirm_it(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	   
	}
	

	@Given("^I click sign up button$")
	public void i_click_sign_up_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should see the customers portal page\\.$")
	public void i_should_see_the_customers_portal_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
