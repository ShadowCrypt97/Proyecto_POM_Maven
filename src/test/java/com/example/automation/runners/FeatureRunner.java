package com.example.automation.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/cucumber_feature.feature",
        glue = "com.example.automation.stepdefinitions",
        tags = "@Scenario",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome=true
)

public class FeatureRunner {
}
