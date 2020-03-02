package com.fingertip.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="./Features/",
strict = true,
glue = {"com.fingertip.stepdef"},
format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
monochrome = true, //Readable format
 //it will check if any step is not defined in step definition file
tags = {"@login"}
,dryRun = false)

public class TestRunner {

}
