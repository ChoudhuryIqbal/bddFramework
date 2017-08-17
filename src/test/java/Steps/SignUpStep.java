/**
 * 
 */
package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.BaseUtil;
import cucumber.api.java.en.*;
import junit.framework.Assert;

/**
 * @author choudhuryIqbal
 *
 */
public class SignUpStep extends BaseUtil{
	private BaseUtil base;
	public SignUpStep(BaseUtil base) {
		this.base=base;
	}
	@Given("^: I click My Account Tab$")
	public void i_click_My_Account_Tab() throws Throwable {
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		base.driver.get("http://www.phptravels.net/");
		base.driver.findElement(By.linkText("My Account")).click();
	}

	@Given("^I click sign up from dropdown$")
	public void i_click_sign_up_from_dropdown() throws Throwable {
		base.driver.findElement(By.linkText("Sign Up")).click();
	}
	@Given("^I enter the firstname as\"([^\"]*)\", last name as \"([^\"]*)\", mobile no as \"([^\"]*)\", email as \"([^\"]*)\",password as\"([^\"]*)\" and ;confirm it \"([^\"]*)\"$")
	public void i_enter_the_firstname_as_last_name_as_mobile_no_as_email_as_password_as_and_confirm_it(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	   base.driver.findElement(By.name("firstname")).sendKeys(arg1);
	   base.driver.findElement(By.name("lastname")).sendKeys(arg2);
	   base.driver.findElement(By.name("phone")).sendKeys(arg3);
	   base.driver.findElement(By.name("email")).sendKeys(arg4);
	   base.driver.findElement(By.name("password")).sendKeys(arg5);
	   base.driver.findElement(By.name("confirmpassword")).sendKeys(arg6);





	}
	

	@Given("^I click sign up button$")
	public void i_click_sign_up_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   base.driver.findElement(By.linkText("Sign Up")).click();
		   

	}

	@Then("^I should see the customers portal page\\.$")
	public void i_should_see_the_customers_portal_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("http://www.phptravels.net/account/",base.driver.getCurrentUrl());
	}


}
