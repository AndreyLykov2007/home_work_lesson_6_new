package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private SelenideElement inputFirstName = $("#firstName");
    SelenideElement inputLastName = $("#lastName");
    SelenideElement inputUserEmail = $("#userEmail");
    SelenideElement setGender = $("#genterWrapper");
    SelenideElement setMobilePhone = $("#userNumber");
    SelenideElement inputSubjects = $("#subjectsInput");
    SelenideElement calendarInput = $(".react-datepicker-wrapper");
    SelenideElement inputHobbies = $("#hobbiesWrapper");
    SelenideElement uploadPictureForm = $("#uploadPicture");
    SelenideElement inputAddress = $("#currentAddress");
    SelenideElement inputState = $("#react-select-3-input");
    SelenideElement inputCity = $("#react-select-4-input");
    SelenideElement submitButton = $("#submit");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        inputFirstName.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        inputLastName.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        inputUserEmail.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        setGender.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setMobilePhone(String value) {
        setMobilePhone.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        new CalendarComponent().setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        inputSubjects.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        inputHobbies.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        uploadPictureForm.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setAddress(String value) {
        inputAddress.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        inputState.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setCity(String value) {
        inputCity.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage pushSubmit() {
        submitButton.click();
        return this;
    }
}