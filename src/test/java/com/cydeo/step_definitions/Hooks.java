package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In thıs class we will be able to pass pre & past conditions
to each step scenario  and each step
 */
public class Hooks {

    // import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){

        System.out.println("====Setting up browser using cucumber @Before");

    }

    @After
    public void  tearDownScenario(){

        System.out.println("===Closing browser using Cucumber @After");
        System.out.println("===Scenario ended / Take screenshot if failed");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--------->applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("---------> applying tearDown using @AfterStep");
    }





}
