package denis.timushev;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class leprologintest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchLeproTest() {
        open("https://leprosorium.ru/login/");
        $("[id=js-login]").click();
        $("[id=js-auth_username]").setValue("jovan");
        $("[id=js-auth_password]").setValue("qwerty").pressEnter();
        $("[id=js-login]").shouldHave(text("Вы Дэнни Де Вито?"));
    }
}
