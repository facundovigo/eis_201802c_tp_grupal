package gradle.cucumber;

import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicStepdefs {

    @When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        new Production().doWork();
        
    }
}
