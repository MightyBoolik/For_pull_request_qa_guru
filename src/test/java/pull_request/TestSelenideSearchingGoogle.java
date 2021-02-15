package pull_request;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenideSearchingGoogle {

        @Test
        void selenideSearchTest() {
            open("https://www.google.com/");
            $(byName("q")).setValue("Selenide").pressEnter();
            $("#search").shouldHave(text("selenide.org"));
        }
}
