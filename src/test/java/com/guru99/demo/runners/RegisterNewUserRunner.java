package com.guru99.demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/guru99demo.feature",
        glue = "com.guru99.demo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegisterNewUserRunner {
}
