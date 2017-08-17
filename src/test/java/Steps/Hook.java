/**
 * 
 */
package Steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author choudhuryIqbal
 *
 */
public class Hook {
	private BaseUtil base;
	public Hook (BaseUtil base) {
		this.base=base;
	}
	
	@Before
	public void InitializeTest() {
		
	}
	
	@After
	public void TearDownTest(Scenario scenario) {
		
	}

}
