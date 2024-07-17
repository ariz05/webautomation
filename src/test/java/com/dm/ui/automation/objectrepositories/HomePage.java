package com.dm.ui.automation.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver lDriver;
    @FindBy(xpath = "//*[contains(text() , 'Log in')]")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@data-testid = 'todays-date']")
    WebElement lblTodayDate;

    public HomePage(WebDriver lDriver) {
        this.lDriver = lDriver;
        PageFactory.initElements(lDriver, this);
    }

    public void clickLoginButton() {
        btnLogin.click();
        System.out.println("Log in button is clicked successfully.");

    }

    public String getTodayDate() {
        String dateToday = lblTodayDate.getText();
        System.out.println("Today's date is retrieved successfully.");
        return dateToday;

    }

    public String getHomePageTitle() {
        String title = lDriver.getTitle();
        System.out.println("Home page is navigated successfully.");
        return title;

    }



}
