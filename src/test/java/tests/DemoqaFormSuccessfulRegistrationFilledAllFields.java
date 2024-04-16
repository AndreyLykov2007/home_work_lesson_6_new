package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DemoqaFormSuccessfulRegistrationFilledAllFields extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationFilledAllFieldsTest() {
        registrationPage.openPage();
    }
}
