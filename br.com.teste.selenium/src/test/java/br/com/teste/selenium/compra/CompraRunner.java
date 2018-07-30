package br.com.teste.selenium.compra;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 format = { "pretty", "html:target/cucumber" }
                 ,monochrome = true
                 ,glue = {"br.com.teste.selenium.compra.steps" }
                 ,features = {"src/test/resources/Compra.feature"}
                 , snippets = cucumber.api.SnippetType.CAMELCASE
                 //,tags = "@CT02"
               	 )

 public class CompraRunner {
	@BeforeClass
	public static void setup() {

	}  

} 
