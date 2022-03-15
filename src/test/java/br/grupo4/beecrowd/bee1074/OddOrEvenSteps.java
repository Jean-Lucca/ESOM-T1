package br.grupo4.beecrowd.bee1074;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OddOrEvenSteps {
	private OddOrEven oddOrEven = new OddOrEven();
	private String str;

	@Given("the number {int}")
    public void initializeCalculator(int num) throws Throwable {
		str = oddOrEven.check(num);
    }

    @Then("the result should be {string}")
    public void validateResult(String result) throws Throwable {
        Assert.assertEquals(str, result);
    }
}
