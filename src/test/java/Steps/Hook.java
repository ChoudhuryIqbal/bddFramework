/**
 * 
 */
package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author choudhuryIqbal
 *
 */
public class Hook extends BaseUtil{
	private BaseUtil base;
	public Hook (BaseUtil base) {
		this.base=base;
	}
	
	@Before
	public void InitializeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\choudhuryIqbal\\eclipse-workspace\\bdd-framework\\driver\\chromedriver.exe");
		base.driver=new ChromeDriver();
		//driver.get("http://www.phptravels.net/");
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		base.driver.get("http://www.phptravels.net/");
	}
	
	@After
	public void TearDownTest(Scenario scenario) {
		if (scenario.isFailed()) {
			System.out.println(scenario.getName());
		}
	}

}
