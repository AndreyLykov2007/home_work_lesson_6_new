package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.CheckResultComponent;

public class DemoqaFormNegativeUnfilledFamilyField extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckResultComponent checkResultComponent = new CheckResultComponent();

    @Test
    void successfulRegistrationFilledAllFieldsTest() {
        registrationPage.openPage()
                .setFirstName("Alex")
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

        checkResultComponent.checkResultWindowNotAppeared();
    }
}
