package com.api.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty:target/cucumber/cucumber.txt",
                "json:target/cucumber/cucumber.json",
                "html:target/cucumber/cucumber.html",
        }
        ,features= {"src/test/resources/features"}
        ,glue = {"com.api.stepdefinition"}
         ,monochrome = true
        ,snippets = SnippetType.CAMELCASE
        ,tags = "@messageAPI"

)
public class TestRunner {

}