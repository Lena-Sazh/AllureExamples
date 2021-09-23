package com.sazhina;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Open main page")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("Search for repository {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository).submit();
    }

    @Step("Go to repository {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Open Issues directory")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Check if Issue with name {name} is exist")
    public void shouldSeeIssueWithName(String name) {
        $(byText(name)).should(Condition.visible);
    }
}