package org.BasicCucumber.Runner;
 
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;

 
@CucumberOptions( features = "classpath:Features/Facebook.feature" ,
				glue={"classpath:org.BasicCucumber.StepDefinition"}
				)
 
public class Runner extends AbstractTestNGCucumberTests {
 

	
}