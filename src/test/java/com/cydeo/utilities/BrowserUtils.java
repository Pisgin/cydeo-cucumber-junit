package com.cydeo.utilities;

import org.junit.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    //TC #2: Create utility method
    // 1. Create a new class called BrowserUtils
    //2. Create a method to make Task1 logic re-usable
    //3. When method is called, it should switch window and verify title.

    //Method info:
    //• Name: switchWindowAndVerify
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedInUrl
    //• Arg3: String expectedTitle
    //

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle) {
        Set<String> allWindoewsHandle = Driver.getDriver().getWindowHandles();
        for (String each : allWindoewsHandle) {

            Driver.getDriver().switchTo().window(each);

            // System.out.println("each = " + each);

            System.out.println("Current Url : " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    /**
     *
     * @param expectedInURL
     */
    public static void verifyURLContains ( String expectedInURL){

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains( expectedInURL ) );

    }

}
