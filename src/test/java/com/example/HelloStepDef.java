package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class HelloStepDef{
    private String greeting;

    @Given("I have a greeting")
    public void i_have_a_greeting() {
        greeting = "Hello, ";
    }

    @When("I say hello")
    public void i_say_hello() {
        greeting += "World!";
    }

    @Then("I should see {string}")
    public void i_should_see(String expected) {
        assertEquals(expected, greeting);
    }

    //Parameter testing
    @Given("I am on the page")
    public void iAmOnThePage() {

    }
    @When("I say {string}")
    public void iSay(String message) {

        System.out.println(message);
    }

    @Then("I should see a message{string}")
    public void iShouldSeeAMessage(String status) {

        assertEquals("200", status);
    }
}
