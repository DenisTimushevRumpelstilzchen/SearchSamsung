package denis.timushev;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class searchNewTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchYandexTest() {
        open("https://yandex.ru/");
        $(".home-link_hover_inherit").click();
        $(".passp-exp-register-button").click();
        $(".Link_weight_medium").shouldHave(text("Уже есть аккаунт")).click();
        $(".passp-route-enter-done").shouldHave(text("Войти с помощью"));
    }
}