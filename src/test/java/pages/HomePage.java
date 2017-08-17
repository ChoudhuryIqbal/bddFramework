/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author choudhuryIqbal
 *
 */
public class HomePage {
	/**
	 * 
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="My Account")
	private WebElement accountLocator;
	
	@FindBy(linkText="Sign Up")
	private WebElement signUpButtonLocator;


	public void cllickInMyAccount() {
		accountLocator.click();
	}
	public void clickIntoSignUpTab() {
		signUpButtonLocator.click();
		
	}


}
