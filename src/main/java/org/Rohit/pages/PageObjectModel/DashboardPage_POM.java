package org.Rohit.pages.PageObjectModel;

import org.Rohit.pages.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM(){

    }


    // Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");



    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }


}