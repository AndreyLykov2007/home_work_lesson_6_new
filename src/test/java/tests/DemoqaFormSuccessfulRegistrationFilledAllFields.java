package tests;

import org.junit.jupiter.api.Test;
import pages.components.CheckResultInTableComponent;
import pages.RegistrationPage;

public class DemoqaFormSuccessfulRegistrationFilledAllFields extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckResultInTableComponent checkResultComponent = new CheckResultInTableComponent();

    @Test
    void successfulRegistrationFilledAllFieldsTest() {
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Ivanov")
                .setUserEmail("alexivanov20251718@gmail.com")
                .setGender("Male")
                .setMobilePhone("9999999901")
                .setDateOfBirth("28", "August", "1980")
                .setSubjects("English")
                .setHobbies("Reading")
                .uploadPicture("example.jpg")
                .setAddress("Some address 11")
                .setState("Uttar Pradesh")
                .setCity("Agra")
                .pushSubmit();

        checkResultComponent.checkResult("Student Name", "Alex Ivanov")
                .checkResult("Student Email", "alexivanov20251718@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9999999901")
                .checkResult("Date of Birth", "28 August,1980")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Reading")
                .checkResult("Picture", "example.jpg")
                .checkResult("Address", "Some address 11")
                .checkResult("State and City", "Uttar Pradesh Agra");
    }
}
