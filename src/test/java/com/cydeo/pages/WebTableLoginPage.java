package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@class = 'btn btn-primary login__submit']")
    public WebElement loginButton;

    /**
     * when we call this method , it will directly login using
     * <p>
     * Username : Test
     * password : Tester
     */
    public void logın() {

        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();

    }

    public void login(String username, String password) {

        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();

    }

    /**
     * This method will log in using credential fram configuration.properties
     */
    public void loginWithConfig(){

        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username") );
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw") );
        loginButton.click();

    }


}
