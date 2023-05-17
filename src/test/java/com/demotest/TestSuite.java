package com.demotest;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty", "html:target/site/serenity/"},
        glue = {"com.demotest.defs", "com.demotest.myhooks"})
public class TestSuite {
}