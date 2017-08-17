/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author choudhuryIqbal
 *
 */
public class RegisterPage {
	@FindBy(name="firstname")
	public WebElement firstName;
	
	@FindBy(name="lastname")
	public WebElement lastName;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="phone")
	public WebElement phone;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="confirmpassword")
	public WebElement confirmPassword;
	
	@FindBy(linkText="Sign Up")
	public WebElement signUpButton;
	
	public void typeFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void typeLastName(String lName) {
	lastName.sendKeys(lName);
	}
	public void typeEmail(String eMail) {
	email.sendKeys(eMail);
	}
	public void typePhoneNo(String mPhone) {
	phone.sendKeys(mPhone);
	}
	
	public void typePassword(String pWord) {
		password.sendKeys(pWord);
	}
	public void typeConfirmPassword(String cPass) {
		confirmPassword.sendKeys(cPass);
	}

}
