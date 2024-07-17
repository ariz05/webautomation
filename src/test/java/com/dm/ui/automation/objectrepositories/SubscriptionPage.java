package com.dm.ui.automation.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {

    WebDriver lDriver;

    public SubscriptionPage(WebDriver lDriver) {
        this.lDriver = lDriver;
        PageFactory.initElements(lDriver, this);
    }

    public String getSubscriptionPageTitle() {
        String title = lDriver.getTitle();
        System.out.println("Subscription page is navigated successfully.");
        return title;

    }
}
