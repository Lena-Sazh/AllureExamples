package com.sazhina;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "с днем археолога!";

    @Test
    public void testGithub() {

        step("Open main page", () -> open("https://github.com/"));

        step("Search for repository " + REPOSITORY, () -> $(".header-search-input").setValue(REPOSITORY).submit());

        step("Go to repository " + REPOSITORY, () -> $(linkText(REPOSITORY)).click());

        step("Open Issues Tab", () -> $(partialLinkText("Issues")).click());

        step("Check if issue " + ISSUE_NAME + " is exist", () -> $(byText(ISSUE_NAME)).should(Condition.visible));
    }
}