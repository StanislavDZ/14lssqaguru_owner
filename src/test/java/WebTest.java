import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase {

    @Test
    public void webTest() {
        step("Открываем главную страницу", () -> {
            open("https://zen.yandex.ru/");
        });

        step("Вводим поисковый запрос", () -> {
            $("[class=\"zen-ui-search__input\"]").setValue("Такер Карлсон на русском").pressEnter();
            $("[class=\"zen-ui-source-snippet__title\"]").shouldHave(text("Такер Карлсон на русском"));
        });

    }
}
