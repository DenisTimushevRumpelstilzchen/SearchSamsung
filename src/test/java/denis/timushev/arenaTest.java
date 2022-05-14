package denis.timushev;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class arenaTest {

    @Test
    void searchJUnit5Code() {
        open("https://market.yandex.ru/");
        $("[id=header-search]").setValue("s22").pressEnter();
        $(".utilityfocus").shouldHave(text("Подтвердите, что запросы отправляли вы, а не робот"));
    }
}
