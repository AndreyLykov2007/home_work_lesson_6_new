package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckResultComponent {
    SelenideElement resultTable = $(".table-responsive");

    public CheckResultComponent checkResult(String key, String value) {
        resultTable.$(byText(key)).sibling(0).shouldHave(text(value));
        return this;
    }

    public CheckResultComponent checkResultWindowNotAppeared() {
            resultTable.shouldNot(visible);
            return this;
    }
}
