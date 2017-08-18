/**
 * 
 */
package Features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author choudhuryIqbal
 r*
 */
//@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Features",glue= {"Steps"}
	,plugin = {"json:target/cucumber.json","html:target/size/cucumber-pretty"}
		
		)
public class sampleTestRunner extends AbstractTestNGCucumberTests{

}
