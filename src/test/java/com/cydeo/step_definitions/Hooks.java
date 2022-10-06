package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In thıs class we will be able to pass pre & past conditions
to each step scenario  and each step
 */
public class Hooks {

    // import from io.cucumber.java not from junit
    //  @Before (order = 2)
  /*  public void setupScenario() {

        System.out.println("====Setting up browser using cucumber @Before");

    }
*/
    // @Before (value = "@login" , order = 1)


    public void setupScenarioForLogins() {

        System.out.println("====this will only apply to scenarios with @login tag");

    }

    @Before(value = "@db", order = 0)
    public void setupForDatabeseScenario() {

        System.out.println("====this will only apply to scenarios with @db tag");

    }

    @After
    public void tearDownScenario(Scenario scenario) {


        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        /*
        System.out.println("===Closing browser using Cucumber @After");
        System.out.println("===Scenario ended / Take screenshot if failed");

         */


        Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("--------->applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("---------> applying tearDown using @AfterStep");
    }


}
