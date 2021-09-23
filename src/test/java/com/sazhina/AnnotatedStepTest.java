package com.sazhina;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "с днем археолога!";

    @Test
    public void testGithub() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssueWithName(ISSUE_NAME);
    }
}