package denis.timushev;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class searchTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchSeroTest() {
        open("https://www.mvideo.ru/");
        $("[id=\"1\"]").setValue("the sero").pressEnter();
        $(".plp__card-grid")
                .shouldHave(text("QE43LS05TAU"));
    }
}
