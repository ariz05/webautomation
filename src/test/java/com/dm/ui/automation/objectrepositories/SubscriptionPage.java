package com.dm.ui.automation.objectrepositories;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {

    WebDriver lDriver;

    public SubscriptionPage(WebDriver lDriver) {
        this.lDriver = lDriver;
        PageFactory.initElements(lDriver, this);
    }

    @Step("Get subscription page title.")
    public String getSubscriptionPageTitle() {
        String title = lDriver.getTitle();
        System.out.println("Subscription page is retrieved successfully.");
        return title;

    }
}
