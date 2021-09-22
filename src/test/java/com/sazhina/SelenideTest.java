package com.sazhina;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    public void testGithub() {
        open("https://github.com/");


    }
}
