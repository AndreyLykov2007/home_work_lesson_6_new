package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.CheckResultInTableComponent;

public class DemoqaFormSuccessfulRegistrationFilledNecessaryFields extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckResultInTableComponent checkResultComponent = new CheckResultInTableComponent();

    @Test
    void successfulRegistrationFilledAllFieldsTest() {
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Ivanov")
                .setGender("Male")
                .setMobilePhone("9999999901")
                .setDateOfBirth("28", "August", "1980")
                .pushSubmit();

        checkResultComponent.checkResult("Student Name", "Alex Ivanov")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9999999901")
                .checkResult("Date of Birth", "28 August,1980");
    }
}
