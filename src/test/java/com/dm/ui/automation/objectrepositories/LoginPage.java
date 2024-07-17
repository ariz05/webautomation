package com.dm.ui.automation.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver lDriver;
    @FindBy(xpath = "//input[@name = 'email']")
    WebElement txtEmail;

    @FindBy(xpath = "//button[contains(text() , 'Continue')]")
    WebElement btnContinue;

    @FindBy(xpath = "//input[@name = 'password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@data-testid = 'api-error']/span")
    WebElement lblErrorMessage;


    public LoginPage(WebDriver lDriver) {
        this.lDriver = lDriver;
        PageFactory.initElements(lDriver, this);
    }

    public void provideEmail(String email) {
        txtEmail.sendKeys(email);
        System.out.println("Email is provided successfully.");

    }

    public void clickContinueButton() {
        btnContinue.click();
        System.out.println("Continue button is clicked successfully.");

    }

    public void providePassword(String password) {
        txtPassword.sendKeys(password);
        System.out.println("Password is provided successfully.");

    }

    public void clickLoginButton() {
        btnLogin.click();
        System.out.println("Log in button is clicked successfully.");

    }

    public String getErrorMessageText() {
        String errorMessage = lblErrorMessage.getText();
        System.out.println("Error message is retrieved successfully.");
        return errorMessage;

    }

    public String getLoginPageTitle() {
        String title = lDriver.getTitle();
        System.out.println("Login page is navigated successfully.");
        return title;

    }
}
